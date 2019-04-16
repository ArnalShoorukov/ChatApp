package com.android.qooveechats.Models.login

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable

class Password : Serializable {

    @SerializedName("password_old")
    @Expose
    var password_old: String? = null
    @SerializedName("password")
    @Expose
    var password: String? = null


}