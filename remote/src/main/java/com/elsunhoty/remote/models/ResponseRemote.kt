package com.elsunhoty.remote.models

import com.google.gson.annotations.SerializedName

open class ResponseRemote<T>(
    @SerializedName("code")
    val responseCode: Int,
    @SerializedName("status")
    val status: String,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: T
)
