package com.example.cannadex.data.model

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class EdiblesResponse(
	@Json(name="data")
	val edibles: List<Edible?>? = null,
	@Json(name="meta")
	val meta: Meta? = null
) : Parcelable










