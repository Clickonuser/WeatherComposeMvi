package com.example.weathercomposemvi

import android.app.Application
import com.example.weathercomposemvi.di.ApplicationComponent
import com.example.weathercomposemvi.di.DaggerApplicationComponent

class WeatherApp: Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}