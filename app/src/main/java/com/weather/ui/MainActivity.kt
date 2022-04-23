package com.weather.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.weather.HourlyWeatherAdapter
import com.weather.R
import com.weather.utils.addTo
import com.weather.api.AccuweatherApi
import com.weather.databinding.ActivityMainBinding
import com.weather.model.CurrentWeather
import com.weather.model.DailyForecastsbase
import com.weather.model.HourlyWeather

import com.weather.utils.Logger
import com.weather.utils.injector
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var api: AccuweatherApi
    private val compositeDisposable = CompositeDisposable()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        injector().inject(this)
    }

    override fun onResume() {
        super.onResume()
        callApi()
        callCurrentApi()
    }

    private fun callApi() {
        api.getWeather()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { result ->
                //logger.debug("response: ${result}")
                updateData(result)
            }.addTo(compositeDisposable)
    }

    private fun callCurrentApi(){
        api.getCurrent()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe{current ->
                logger.debug("resp ${current}")
               updateCurrent(current)
            }.addTo(compositeDisposable)
    }

    private fun callhourlyApi(){
        api.gethourly()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { hourly ->
                logger.debug("hourly ${hourly}")
                updatehourly(hourly)
            }.addTo(compositeDisposable)
    }

    private fun updateData(result: DailyForecastsbase) {
        binding.headline.text = result.headline.text
        binding.tempmin.text = result.dailyForecasts[0].temperature.minimum.value.toString()
        binding.tempmax.text = result.dailyForecasts[0].temperature.maximum.value.toString()
        binding.status.text = result.dailyForecasts[0].day.shortPhrase
        binding.sunrise.text = result.dailyForecasts[0].sun.rise
        binding.sunset.text = result.dailyForecasts[0].sun.set
        binding.rain.text = result.dailyForecasts[0].day.rainProbability.toString()
        binding.wind.text =result.dailyForecasts[0].day.wind.speed.value.toString()
        binding.air.text = result.dailyForecasts[0].airAndPollen[0].value.toString()


    }

    private fun updatehourly(hourlyWeather: ArrayList<HourlyWeather>){
        binding.hourlyrecycler.adapter
    }
    private fun updateCurrent(currentWeather: ArrayList<CurrentWeather>){
        binding.temp.text = currentWeather[0].temperaturec.metric.value.toString()
    }


    override fun onPause() {
        compositeDisposable.clear()
        super.onPause()
    }

    companion object {
        private val logger = Logger(MainActivity.javaClass.name)
    }
}