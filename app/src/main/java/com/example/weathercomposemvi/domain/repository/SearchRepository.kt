package com.example.weathercomposemvi.domain.repository

import com.example.weathercomposemvi.domain.entity.City

interface SearchRepository {

    suspend fun search(query: String): List<City>
}