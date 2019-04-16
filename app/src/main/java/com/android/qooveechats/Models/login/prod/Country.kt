package com.qoovee.app.android.models.login.prod

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable

class Country : Serializable {

    @SerializedName("code")
    @Expose
    var code: String? = null
    @SerializedName("name")
    @Expose
    var name: String? = null

    companion object {
        private const val serialVersionUID = -23685676690124540L
    }

}