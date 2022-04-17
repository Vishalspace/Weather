package com.weather.api


import com.weather.model.DailyForecastsbase
import io.reactivex.Single
import retrofit2.http.GET

//https://run.mocky.io/v3/86ec7a92-d0ea-4a22-8723-1a16e01eb02a

interface AccuweatherApi {
    //Query generator
    @GET("86ec7a92-d0ea-4a22-8723-1a16e01eb02a")
    fun getWeather(): Single<DailyForecastsbase>

//    fun getWeather(
//        @Query("hkGkNYitn3EM5H0XEWsJIdKYPLAahBKN") api:String,
//        @Query("locationKey") key: Int
//    ): Call<DailyForecastsbase>

}




//search
//http://dataservice.accuweather.com/locations/v1/search?apikey=hkGkNYitn3EM5H0XEWsJIdKYPLAahBKN&q=rewari

//accuweather
//"http://dataservice.accuweather.com/locations/v1/cities/autocomplete?apikey=hkGkNYitn3EM5H0XEWsJIdKYPLAahBKN&q=rewa"

//weather base
//http://dataservice.accuweather.com/currentconditions/v1/188413?apikey=hkGkNYitn3EM5H0XEWsJIdKYPLAahBKN&details=true

