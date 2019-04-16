package com.android.qooveechats.Listeners

import com.squareup.moshi.Json

data class GetOpponentsCommand (
    @Json(name = "command") var command : String = "opponents"
)