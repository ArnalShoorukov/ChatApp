package com.android.qooveechats.Fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.qooveechats.Listeners.ChatListener
import com.android.qooveechats.Listeners.GetOpponentsCommand
import com.android.qooveechats.Listeners.Prefs
import com.tinder.scarlet.Scarlet
import com.tinder.scarlet.WebSocket
import com.tinder.scarlet.messageadapter.moshi.MoshiMessageAdapter
import com.tinder.scarlet.streamadapter.rxjava2.RxJava2StreamAdapterFactory
import com.tinder.scarlet.websocket.okhttp.OkHttpClientWebSocketConnectionEstablisher
import com.tinder.scarlet.websocket.okhttp.OkHttpWebSocket
import com.tinder.scarlet.websocket.okhttp.newWebSocketFactory
import com.tinder.scarlet.websocket.okhttp.request.RequestFactory
import io.reactivex.disposables.Disposable
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class ListChatFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null
    var disposables : Disposable? = null
    var prefs : Prefs? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val rootView =  inflater.inflate(com.android.qooveechats.R.layout.fragment_list_chat, container, false)
        prefs = Prefs(context!!)
        val url = "wss://notification.qoovee.com/chat/"
        testScarlet(url)
//        testScarlet("wss://ws-feed.gdax.com")
        return rootView
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    private fun testScarlet (url : String) {
        Log.d("TEST1234", "testScarlet ${prefs!!.cookie}")
        val okHttpClient = OkHttpClient.Builder().build()

        val scarletInstance = Scarlet.Builder()
            .webSocketFactory(okHttpClient.newWebSocketFactory(url, prefs!!.cookie!!))
            .addMessageAdapterFactory(MoshiMessageAdapter.Factory())
            .addStreamAdapterFactory(RxJava2StreamAdapterFactory())
            .build()

        val testService = scarletInstance.create(ChatListener::class.java)

        testService.observeonConnectionOpenedEvent().subscribe(
            {
                when(it){
                    is WebSocket.Event.OnConnectionOpened<*> -> {
                        Log.d("TEST1234", "OnConnectionOpened")
                        testService.opponentsGet(
                            GetOpponentsCommand()
                        )
                    }
                    is WebSocket.Event.OnMessageReceived -> {

                        Log.d("TEST1234", "OnMessageReceived ${it.message}")
                    }
                    is WebSocket.Event.OnConnectionClosed -> {
                        Log.d("TEST1234", "OnConnectionClosed")
                    }
                    is WebSocket.Event.OnConnectionFailed -> {
                        Log.d("TEST1234", "OnConnectionFailed")
                        it.throwable.printStackTrace()
                    }
                }
            },
            {
                it.printStackTrace()
            }
        )




    }

    fun OkHttpClient.newWebSocketFactory(requestFactory: RequestFactory): WebSocket.Factory {
        return OkHttpWebSocket.Factory(OkHttpClientWebSocketConnectionEstablisher(this, requestFactory))
    }

    fun OkHttpClient.newWebSocketFactory(url: String, cookie: String): WebSocket.Factory {

        return newWebSocketFactory(StaticUrlRequestFactory(url, cookie))
    }

    internal class StaticUrlRequestFactory(
        private val url: String,
        private val cookie : String
    ) : RequestFactory {

        override fun createRequest(): Request = Request.Builder()
            .url(url)
            .addHeader("Cookie", "QSSID=ijj96j3xeqbq8nfo4fs5pqzlfvlbfrgb")
            .build()
    }


    interface OnFragmentInteractionListener

    companion object {
        @JvmStatic
        fun newInstance() =
            ListChatFragment().apply {}
    }
}
