package com.weather.api



import com.weather.model.CurrentWeather
import com.weather.model.DailyForecastsbase
import io.reactivex.Single
import retrofit2.http.GET

//https://run.mocky.io/v3/86ec7a92-d0ea-4a22-8723-1a16e01eb02a

//3572c577-3f4a-41bf-94aa-1bdc2e79a2b5
interface AccuweatherApi {
    //Query generator
    @GET("forecasts/v1/daily/1day/188413?apikey=7Of3weffiwTmoxZmXNClACNb99gZDpyr&details=true&metric=true")
    fun getWeather(): Single<DailyForecastsbase>
//
    @GET("currentconditions/v1/188413?apikey=7Of3weffiwTmoxZmXNClACNb99gZDpyr")
    fun getCurrent() : Single<ArrayList<CurrentWeather>>

}




//search
//https://dataservice.accuweather.com/locations/v1/search?apikey=hkGkNYitn3EM5H0XEWsJIdKYPLAahBKN&q=rewari

//accuweather
//"https://dataservice.accuweather.com/locations/v1/cities/autocomplete?apikey=hkGkNYitn3EM5H0XEWsJIdKYPLAahBKN&q=rewa"

//weather base
//https://dataservice.accuweather.com/currentconditions/v1/188413?apikey=hkGkNYitn3EM5H0XEWsJIdKYPLAahBKN&details=true

//"http://dataservice.accuweather.com/forecasts/v1/daily/1day/188413?apikey=%09hkGkNYitn3EM5H0XEWsJIdKYPLAahBKN&details=true"
