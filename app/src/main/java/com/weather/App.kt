package com.weather

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import com.weather.di.AppComponent
import com.weather.di.ContextModule
import com.weather.di.DaggerAppComponent
import com.weather.di.NetModule
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

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