package com.weather.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.weather.R
import com.weather.utils.addTo
import com.weather.api.AccuweatherApi
import com.weather.utils.Logger
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var api: AccuweatherApi
    private val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        callApi()
    }

    private fun callApi() {
        api.getWeather()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { result ->
                logger.debug("received response from api")
                println("response: ${result}")
                logger.debug(result.toString())
            }.addTo(compositeDisposable)
    }

    override fun onPause() {
        compositeDisposable.clear()
        super.onPause()
    }

    companion object {
        private val logger = Logger(MainActivity.javaClass.name)
    }
}