package com.android.qooveechats.Models.login.prod

import com.android.qooveechats.Models.login.DataLogin
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable

class LoginP : Serializable {

    @SerializedName("status")
    @Expose
    var status: Boolean? = null
    @SerializedName("data")
    @Expose
    var data: DataLogin? = null

    companion object {
        private const val serialVersionUID = 4861534460790660901L
    }

}
