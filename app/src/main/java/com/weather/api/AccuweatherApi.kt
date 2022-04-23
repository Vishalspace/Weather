package com.weather.api



import com.weather.model.CurrentWeather
import com.weather.model.DailyForecastsbase
import com.weather.model.HourlyWeather
import io.reactivex.Single
import retrofit2.http.GET

interface AccuweatherApi {
    //Query generator
    // @GET("forecasts/v1/daily/1day/188413?apikey=7Of3weffiwTmoxZmXNClACNb99gZDpyr&details=true&metric=true")
    @GET("86ec7a92-d0ea-4a22-8723-1a16e01eb02a")
    fun getWeather(): Single<DailyForecastsbase>
//
    //@GET("currentconditions/v1/188413?apikey=7Of3weffiwTmoxZmXNClACNb99gZDpyr")
    @GET("dfbf80b6-6aa9-4e9c-b747-875aa1a7a2e2")
    fun getCurrent() : Single<ArrayList<CurrentWeather>>

    @GET("1a16d162-9a39-474f-9d0e-b309be6431a3")
    fun gethourly() : Single<ArrayList<HourlyWeather>>

}




//search
//https://dataservice.accuweather.com/locations/v1/search?apikey=hkGkNYitn3EM5H0XEWsJIdKYPLAahBKN&q=rewari

//accuweather autocomplete
//"https://dataservice.accuweather.com/locations/v1/cities/autocomplete?apikey=7Of3weffiwTmoxZmXNClACNb99gZDpyr&q=rewa"

//weather base
//https://dataservice.accuweather.com/currentconditions/v1/188413?apikey=7Of3weffiwTmoxZmXNClACNb99gZDpyr&details=true
//https://run.mocky.io/v3/dfbf80b6-6aa9-4e9c-b747-875aa1a7a2e2

//1day
//"http://dataservice.accuweather.com/forecasts/v1/daily/1day/188413?apikey=7Of3weffiwTmoxZmXNClACNb99gZDpyr&details=true"
//https://run.mocky.io/v3/86ec7a92-d0ea-4a22-8723-1a16e01eb02a

//http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/188413?apikey=7Of3weffiwTmoxZmXNClACNb99gZDpyr&details=true&metric=true
//https://run.mocky.io/v3/525d2b5b-ecef-452a-a5de-e11b898e91ad