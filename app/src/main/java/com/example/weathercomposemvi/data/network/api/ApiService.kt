package com.example.weathercomposemvi.data.network.api

import com.example.weathercomposemvi.data.network.dto.CityDto
import com.example.weathercomposemvi.data.network.dto.WeatherCurrentDto
import com.example.weathercomposemvi.data.network.dto.WeatherForecastDto
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("current.json?key=df1c637cf2e6440f982132240241907")
    suspend fun loadCurrentWeather(
        @Query("q") query: String
    ): WeatherCurrentDto

    @GET("forecast.json?key=df1c637cf2e6440f982132240241907")
    suspend fun loadForecast(
        @Query("q") query: String,
        @Query("days") daysCount: Int = 4
    ): WeatherForecastDto

    @GET("search.json?key=df1c637cf2e6440f982132240241907")
    suspend fun searchCity(
        @Query("q") query: String,
    ): List<CityDto>
}