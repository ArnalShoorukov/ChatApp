package com.qoovee.app.android.models.login.prod

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable

class ContactObject : Serializable {

    @SerializedName("contact")
    @Expose
    var contact: Contact_? = null
    @SerializedName("value")
    @Expose
    var value: String? = null
    @SerializedName("whatsapp")
    @Expose
    var whatsapp: Boolean? = null
    @SerializedName("viber")
    @Expose
    var viber: Boolean? = null
    @SerializedName("telegram")
    @Expose
    var telegram: Boolean? = null
    @SerializedName("email")
    @Expose
    var email: Boolean? = null

    companion object {
        private const val serialVersionUID = -7343825430468072316L
    }

}