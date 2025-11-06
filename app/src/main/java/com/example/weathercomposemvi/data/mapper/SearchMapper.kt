package com.example.weathercomposemvi.data.mapper

import com.example.weathercomposemvi.data.network.dto.CityDto
import com.example.weathercomposemvi.domain.entity.City

fun CityDto.toEntity(): City = City(id, name, country)

fun List<CityDto>.toEntities(): List<City> = map { it.toEntity() }