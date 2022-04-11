package com.weather

import android.app.Application
import com.weather.di.AppComponent
import com.weather.di.ContextModule
import com.weather.di.NetModule

class App : Application() {
    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder()
            .contextModule(ContextModule(applicationContext))
            .netModule(NetModule())
            .build()
    }

}