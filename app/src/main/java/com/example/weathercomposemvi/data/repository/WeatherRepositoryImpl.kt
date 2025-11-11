package com.example.weathercomposemvi.data.repository

import com.example.weathercomposemvi.data.mapper.toEntity
import com.example.weathercomposemvi.data.network.api.ApiService
import com.example.weathercomposemvi.domain.entity.Forecast
import com.example.weathercomposemvi.domain.entity.Weather
import com.example.weathercomposemvi.domain.repository.WeatherRepository
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val apiService: ApiService
): WeatherRepository {
    override suspend fun getWeather(cityId: Int): Weather {
        return apiService.loadCurrentWeather("$PREFIX_CITY_ID$cityId").toEntity()
    }

    override suspend fun getForecast(cityId: Int): Forecast {
        return apiService.loadForecast("$PREFIX_CITY_ID$cityId").toEntity()
    }

    private companion object {
        private const val PREFIX_CITY_ID = "id:"
    }
}