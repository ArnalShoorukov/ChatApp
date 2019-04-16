package com.qoovee.app.android.models.login.prod

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable

class Contact_ : Serializable {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("group")
    @Expose
    var group: String? = null

    companion object {
        private const val serialVersionUID = 2111636352316187610L
    }

}