package com.weather.api

import com.weather.model.DailyForecastsbase
import retrofit2.Call
import retrofit2.http.GET

//https://run.mocky.io/v3/86ec7a92-d0ea-4a22-8723-1a16e01eb02a
interface AccuweatherApi {
    //Query generator
    @GET("86ec7a92-d0ea-4a22-8723-1a16e01eb02a")
    fun getWeather(): Call<DailyForecastsbase>
}