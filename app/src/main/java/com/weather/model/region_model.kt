package com.weather.model

import com.google.gson.annotations.SerializedName

data class region_base (

    @SerializedName("ID") val iD : String,
    @SerializedName("LocalizedName") val localizedName : String,
    @SerializedName("EnglishName") val englishName : String
)