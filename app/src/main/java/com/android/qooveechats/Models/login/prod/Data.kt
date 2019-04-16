package com.android.qooveechats.Models.login.prod

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable

class Data : Serializable {

    @SerializedName("phone")
    @Expose
    var phone: String? = null
    @SerializedName("country")
    @Expose
    var country: String? = null
    @SerializedName("is_active")
    @Expose
    var isActive: Boolean? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("email")
    @Expose
    var email: String? = null
    @SerializedName("service")
    @Expose
    var service: Any? = null
   /* @SerializedName("companies")
    @Expose
    var companies: List<Company>? = null*/
    @SerializedName("token")
    @Expose
    var token: String? = null

    companion object {
        private const val serialVersionUID = -8546381733662227977L
    }

}