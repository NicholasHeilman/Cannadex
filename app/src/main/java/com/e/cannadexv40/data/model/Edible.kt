package com.example.cannadex.data.model

import android.os.Parcelable
import com.example.cannadex.utils.ForceToList
import com.example.cannadex.utils.ForceToString
import com.example.cannadex.utils.ViewType
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.IgnoredOnParcel
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Edible(

    @ForceToList val strain: List<String>? = null,
    val qr: String? = null,
    val image: String? = null,
    @ForceToString val cbd: String? = null,
    val cannabis: Boolean? = null,
    val description: String? = null,
    val type: String? = null,
    val labTest: Boolean? = null,
    val url: String? = null,
    @ForceToString val thc: String? = null,
    val createdAt: String? = null,
    val ocpc: String? = null,
    val hashOil: Boolean? = null,
    val name: String? = null,
    val brand: Brand? = null,
    val updatedAt: String? = null
) : Parcelable {
    @IgnoredOnParcel
    var viewType = ViewType.ITEM
}