package com.weather.model

import com.google.gson.annotations.SerializedName

data class Regionbase (

    @SerializedName("ID") val iD : String,
    @SerializedName("LocalizedName") val localizedName : String,
    @SerializedName("EnglishName") val englishName : String
)