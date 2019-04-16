package com.android.qooveechats.Listeners

import com.android.qooveechats.Models.Opponents
import com.android.qooveechats.Models.ResetConfirmRaw
import com.tinder.scarlet.WebSocket
import com.tinder.scarlet.ws.Receive
import com.tinder.scarlet.ws.Send
import io.reactivex.Flowable
import retrofit2.http.Body
import retrofit2.http.Header

interface ChatListener {

    @Receive
    fun observeonConnectionOpenedEvent(): Flowable<WebSocket.Event>

    /*@Receive
    fun observeTicker(): Flowable<Ticker>*/

    @Send
    fun opponentsGet(): Flowable<Opponents>
}