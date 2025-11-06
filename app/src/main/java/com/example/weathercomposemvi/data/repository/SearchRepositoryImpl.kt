package com.example.weathercomposemvi.data.repository

import com.example.weathercomposemvi.data.mapper.toEntities
import com.example.weathercomposemvi.data.network.api.ApiService
import com.example.weathercomposemvi.domain.entity.City
import com.example.weathercomposemvi.domain.repository.SearchRepository
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val apiService: ApiService
): SearchRepository {
    override suspend fun search(query: String): List<City> {
        return apiService.searchCity(query).toEntities()
    }
}