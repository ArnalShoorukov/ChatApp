package com.android.qooveechats

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.qooveechats.Listeners.Prefs
import com.android.qooveechats.Listeners.RequestInterface
import com.android.qooveechats.Models.ResetConfirmRaw
import com.android.qooveechats.Models.login.Login
import com.facebook.stetho.Stetho
import com.facebook.stetho.okhttp3.StethoInterceptor
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class MainActivity : AppCompatActivity() {
    val BASE_URL = "https://www.qoovee.com/api/v1/"
    private var mCompositeDisposable: CompositeDisposable? = null
    var prefs: Prefs? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Stetho.initializeWithDefaults(this)
        mCompositeDisposable = CompositeDisposable()
        prefs = Prefs(this)

        btn_loginStart.setOnClickListener {
            val email = input_email.text.toString()
            val password = input_password.text.toString()

            loadJSONLogin(email, password)
            //openActivity()
        }
    }


    private fun loadJSONLogin(username: String, password: String) {
        val data =  ResetConfirmRaw()
        data.username = username
        data.newPassword = password
        val type = "application/json"
        val client =  OkHttpClient.Builder()
            .addNetworkInterceptor(StethoInterceptor())
            .followRedirects(false)
            .build()
        val requestInterface = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(ScalarsConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build().create(RequestInterface::class.java)

        mCompositeDisposable?.add(requestInterface.login(prefs!!.token!!,  data)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(this::handleResponse5, this::handleError))
    }
    private fun handleResponse5(response: Response<Login>) {
         when(response.code()) {
             200 -> {
                 val cookie = response.headers().get("Set-Cookie")
                 val cookieFinal = cookie!!.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0]
                 prefs!!.cookie = cookieFinal
                 val androidList = response.body()
                 if (androidList!!.status!!) {
                     prefs!!.token = "QV " + androidList.data!!.token
                     prefs!!.signedIn = true
                     prefs!!.name = androidList.data!!.name
                     prefs!!.email = androidList.data!!.email
                     prefs!!.phone = androidList.data!!.phone
                     prefs!!.contentLanguage = androidList.data!!.language
                     prefs!!.language = androidList.data!!.language
                     prefs!!.userId = androidList.data!!.accountId
                     prefs!!.userCountry = androidList.data!!.country
                     Log.d("Cookies", cookieFinal)

                     openActivity()

                 } else {
                     val toast = Toast.makeText(this, "Error email or password", Toast.LENGTH_SHORT)
                     val v = toast.view.findViewById(android.R.id.message) as TextView
                     v.setTextColor(Color.RED)
                     v.textSize = 20F
                     toast.show()
                 }
             }
             302 -> {
                 val cookie = response.headers().get("Set-Cookie")
                 val cookieFinal = cookie!!.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0]
                 prefs!!.cookie = cookieFinal
                 Log.d("Cookies", cookieFinal)
                 openActivity()

             }
         }

    }
    private fun handleError(error: Throwable) {
        Log.d("Status", error.message)

        //Toast.makeText(context, "Error ${error.localizedMessage}", Toast.LENGTH_SHORT).show()
    }


    fun openActivity(){
        val i = Intent(this, HostActivity::class.java)
        startActivity(i)
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        mCompositeDisposable!!.dispose()
    }
}
