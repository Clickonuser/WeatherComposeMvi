package com.example.weathercomposemvi.data.mapper

import com.example.weathercomposemvi.data.local.model.CityDbModel
import com.example.weathercomposemvi.domain.entity.City

fun City.toDbModel(): CityDbModel = CityDbModel(id, name, country)

fun CityDbModel.toEntity(): City = City(id, name, country)

fun List<CityDbModel>.toEntities(): List<City> = map { it.toEntity() }