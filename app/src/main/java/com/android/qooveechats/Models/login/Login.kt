package com.android.qooveechats.Models.login

import com.android.qooveechats.Models.login.DataLogin
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable

class Login : Serializable {

    @SerializedName("status")
    @Expose
    var status: Boolean? = null
    @SerializedName("data")
    @Expose
    var data: DataLogin? = null

}