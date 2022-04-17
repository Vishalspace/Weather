package com.weather.model

import com.google.gson.annotations.SerializedName

data class Searchbase (

    @SerializedName("Version")
    val version : Int,
    @SerializedName("Key")
    val Key : Int,
    @SerializedName("Type")
    val type : String,
    @SerializedName("Rank")
    val rank : Int,
    @SerializedName("LocalizedName")
    val localizedName : String,
    @SerializedName("Country")
    val country : Country,
    @SerializedName("AdministrativeArea")
    val administrativeArea : AdministrativeArea
)

data class Country (

    val iD : String,
    val localizedName : String
)

data class AdministrativeArea (

    @SerializedName("ID") val iD : String,
    @SerializedName("LocalizedName") val localizedName : String
)