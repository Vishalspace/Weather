package com.weather.model

import com.google.gson.annotations.SerializedName

data class HourlyWeather(
    @SerializedName("DateTime") val dateTime : String,
    @SerializedName("EpochDateTime") val epochDateTime : Int,
    @SerializedName("WeatherIcon") val weatherIcon : Int,
    @SerializedName("IconPhrase") val iconPhrase : String,
    @SerializedName("HasPrecipitation") val hasPrecipitation : Boolean,
    @SerializedName("IsDaylight") val isDaylight : Boolean,
    @SerializedName("Temperature") val temperatureh : Temperatureh,
    @SerializedName("RealFeelTemperature") val realFeelTemperatureh : RealFeelTemperatureh,
    @SerializedName("RealFeelTemperatureShade") val realFeelTemperatureShadeh : RealFeelTemperatureShadeh,
    @SerializedName("WetBulbTemperature") val wetBulbTemperatureh : WetBulbTemperatureh,
    @SerializedName("DewPoint") val dewPointh : DewPointh,
    @SerializedName("Wind") val wind : Wind,
    @SerializedName("WindGust") val windGust : WindGust,
    @SerializedName("RelativeHumidity") val relativeHumidity : Int,
    @SerializedName("IndoorRelativeHumidity") val indoorRelativeHumidity : Int,
    @SerializedName("Visibility") val visibilityh : Visibilityh,
    @SerializedName("Ceiling") val ceilingh : Ceilingh,
    @SerializedName("UVIndex") val uVIndex : Int,
    @SerializedName("UVIndexText") val uVIndexText : String,
    @SerializedName("PrecipitationProbability") val precipitationProbability : Int,
    @SerializedName("ThunderstormProbability") val thunderstormProbability : Int,
    @SerializedName("RainProbability") val rainProbability : Int,
    @SerializedName("SnowProbability") val snowProbability : Int,
    @SerializedName("IceProbability") val iceProbability : Int,
    @SerializedName("TotalLiquid") val totalLiquid : TotalLiquid,
    @SerializedName("Rain") val rainh : Rainh,
    @SerializedName("Snow") val snowh : Snowh,
    @SerializedName("Ice") val iceh : Iceh,
    @SerializedName("CloudCover") val cloudCover : Int,
    @SerializedName("Evapotranspiration") val evapotranspirationh : Evapotranspirationh,
    @SerializedName("SolarIrradiance") val solarIrradianceh: SolarIrradianceh
)

data class Ceilingh (

    @SerializedName("Value") val value : Int,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int
)

data class DewPointh (

    @SerializedName("Value") val value : Double,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int
)


data class Evapotranspirationh (

    @SerializedName("Value") val value : Double,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int
)

data class Iceh (

    @SerializedName("Value") val value : Int,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int
)

data class Rainh (

    @SerializedName("Value") val value : Int,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int
)

data class RealFeelTemperatureh (

    @SerializedName("Value") val value : Int,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int,
    @SerializedName("Phrase") val phrase : String
)
data class RealFeelTemperatureShadeh (

    @SerializedName("Value") val value : Double,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int,
    @SerializedName("Phrase") val phrase : String
)

data class Snowh (

    @SerializedName("Value") val value : Int,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int
)
data class WindGusth (

    @SerializedName("Speed") val speed : Speed
)


data class TotalLiquidh (

    @SerializedName("Value") val value : Int,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int
)
data class Windh (

    @SerializedName("Speed") val speedh : Speedh,
    @SerializedName("Direction") val directionh : Directionh
)
data class Directionh (

    @SerializedName("Degrees") val degrees : Int,
    @SerializedName("Localized") val localized : String,
    @SerializedName("English") val english : String
)

data class Speedh (

    @SerializedName("Value") val value : Double,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int
)

data class WetBulbTemperatureh (

    @SerializedName("Value") val value : Double,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int
)

data class Visibilityh (

    @SerializedName("Value") val value : Double,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int
)
data class Temperatureh (

    @SerializedName("Value") val value : Double,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int
)

data class SolarIrradianceh (

    @SerializedName("Value") val value : Double,
    @SerializedName("Unit") val unit : String,
    @SerializedName("UnitType") val unitType : Int
)