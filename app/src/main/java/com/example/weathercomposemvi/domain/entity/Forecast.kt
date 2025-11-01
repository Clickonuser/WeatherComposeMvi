package com.example.weathercomposemvi.domain.entity

data class Forecast(
    val currentWeather: Weather,
    val upcoming: List<Weather>,
)
