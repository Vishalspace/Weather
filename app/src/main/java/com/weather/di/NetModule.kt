package com.weather.di

import com.weather.api.AccuweatherApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
        return Retrofit.Builder()
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl(BASE_URL)
            .build()
    }

    @Provides
    @Singleton
    fun provideAccuweatherApi(retrofit: Retrofit): AccuweatherApi {
        return retrofit.create(AccuweatherApi::class.java)
    }

    companion object {
        //private const val BASE_URL = "http://dataservice.accuweather.com/currentconditions/v1/"
        private const val BASE_URL = "https://dataservice.accuweather.com/forecasts/v1/daily/1day/"
    }
}