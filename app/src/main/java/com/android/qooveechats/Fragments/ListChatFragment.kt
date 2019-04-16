package com.android.qooveechats.Fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.qooveechats.Listeners.Prefs
import io.reactivex.disposables.Disposable


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


    interface OnFragmentInteractionListener

    companion object {
        @JvmStatic
        fun newInstance() =
            ListChatFragment().apply {}
    }
}
