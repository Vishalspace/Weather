package com.weather.model

import com.google.gson.annotations.SerializedName

data class CurrentWeather (

    @SerializedName("LocalObservationDateTime") val localObservationDateTime : String,
    @SerializedName("EpochTime") val epochTime : Int,
    @SerializedName("WeatherText") val weatherText : String,
    @SerializedName("WeatherIcon") val weatherIcon : Int,
    @SerializedName("HasPrecipitation") val hasPrecipitation : Boolean,
    @SerializedName("PrecipitationType") val precipitationType : String,
    @SerializedName("IsDayTime") val isDayTime : Boolean,
    @SerializedName("Temperature") val temperaturec : Temperaturec,
    @SerializedName("RealFeelTemperature") val realFeelTemperature : RealFeelTemperature,
    @SerializedName("RealFeelTemperatureShade") val realFeelTemperatureShade : RealFeelTemperatureShade,
    @SerializedName("RelativeHumidity") val relativeHumidity : Int,
    @SerializedName("IndoorRelativeHumidity") val indoorRelativeHumidity : Int,
    @SerializedName("DewPoint") val dewPoint : DewPoint,
    @SerializedName("Wind") val windc : Windc,
    @SerializedName("WindGust") val windGustc : WindGustc,
    @SerializedName("UVIndex") val uVIndex : Int,
    @SerializedName("UVIndexText") val uVIndexText : String,
    @SerializedName("Visibility") val visibility : Visibility,
    @SerializedName("ObstructionsToVisibility") val obstructionsToVisibility : String,
    @SerializedName("CloudCover") val cloudCover : Int,
    @SerializedName("Ceiling") val ceiling : Ceiling,
    @SerializedName("Pressure") val pressure : Pressure,
    @SerializedName("PressureTendency") val pressureTendency : PressureTendency,
    @SerializedName("ApparentTemperature") val apparentTemperature : ApparentTemperature,
    @SerializedName("WindChillTemperature") val windChillTemperature : WindChillTemperature,
    @SerializedName("WetBulbTemperature") val wetBulbTemperature : WetBulbTemperature,
    @SerializedName("Precip1hr") val precip1hr : Precip1hr,
    @SerializedName("PrecipitationSummary") val precipitationSummary : PrecipitationSummary
)

data class PrecipitationSummary (
    @SerializedName("Precipitation") val precipitation : Precipitation)

data class Precip1hr (

    @SerializedName("Metric") val metric : Metric,
    @SerializedName("Imperial") val imperial : Imperial
)

data class Temperaturec (
    @SerializedName("Metric") val metric : Metric,
    @SerializedName("Imperial") val imperial : Imperial
)

data class Imperial (
    @SerializedName("Value") val value : Int,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int
)

data class Metric (
    @SerializedName("Value") val value : Double,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int
)
data class Ceiling (
    @SerializedName("Metric") val metric : Metric,
    @SerializedName("Imperial") val imperial : Imperial
)
data class Precipitation (
    @SerializedName("Metric") val metric : Metric,
    @SerializedName("Imperial") val imperial : Imperial
)

data class WindGustc (
    @SerializedName("Speed") val speedc : Speedc
)
data class Speedc (

    @SerializedName("Metric") val metric : Metric,
    @SerializedName("Imperial") val imperial : Imperial
)
data class Visibility (
    @SerializedName("Metric") val metric : Metric,
    @SerializedName("Imperial") val imperial : Imperial
)

data class WetBulbTemperature (
    @SerializedName("Metric") val metric : Metric,
    @SerializedName("Imperial") val imperial : Imperial
)
data class Windc (
    @SerializedName("Direction") val directionc : Directionc,
    @SerializedName("Speed") val speed : Speed
)
data class WindChillTemperature (
    @SerializedName("Metric") val metric : Metric,
    @SerializedName("Imperial") val imperial : Imperial
)
data class ApparentTemperature (
    @SerializedName("Metric") val metric : Metric,
    @SerializedName("Imperial") val imperial : Imperial
)
data class DewPoint (
    @SerializedName("Metric") val metric : Metric,
    @SerializedName("Imperial") val imperial : Imperial
)data class Directionc (
    @SerializedName("Degrees") val degrees : Int,
    @SerializedName("Localized") val localized : String,
    @SerializedName("English") val english : String
)

data class Pressure (
    @SerializedName("Metric") val metric : Metric,
    @SerializedName("Imperial") val imperial : Imperial
)

data class PressureTendency (
    @SerializedName("LocalizedText") val localizedText : String,
    @SerializedName("Code") val code : String
)