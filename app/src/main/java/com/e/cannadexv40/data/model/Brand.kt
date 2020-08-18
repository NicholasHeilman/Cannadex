package com.example.cannadex.data.model

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Brand(
    val ocpc: String? = null,
    val name: String? = null
) : Parcelable