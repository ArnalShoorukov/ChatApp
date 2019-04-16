package com.android.qooveechats.Models.login

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DataLogin : Serializable {

    @SerializedName("language")
    @Expose
    var language: String? = null
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
    var companies: List<ResultCompanies>? = null*/
    @SerializedName("token")
    @Expose
    var token: String? = null
    @SerializedName("currency")
    @Expose
    var currency: String? = null
    @SerializedName("user_id")
    @Expose
    var userId: Int? = null
    @SerializedName("account_id")
    @Expose
    var accountId: Int? = null
    @SerializedName("balance")
    @Expose
    var balance: String? = null
    @SerializedName("is_admin")
    @Expose
    var is_admin: Boolean? = false
    @SerializedName("suggest_rate")
    @Expose
    var suggestRate: Int? = null

}