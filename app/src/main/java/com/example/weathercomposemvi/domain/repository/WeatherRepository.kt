package com.example.weathercomposemvi.domain.repository

import com.example.weathercomposemvi.domain.entity.Forecast
import com.example.weathercomposemvi.domain.entity.Weather

interface WeatherRepository {

    suspend fun getWeather(cityId: Int): Weather

    suspend fun getForecast(cityId: Int): Forecast
}