package com.android.qooveechats.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable

class ResetConfirmRaw : Serializable {

    @SerializedName("username")
    @Expose
    var username: String? = null
    @SerializedName("code")
    @Expose
    var code: String? = null
    @SerializedName("password")
    @Expose
    var newPassword: String? = null
  }