package com.example.weathercomposemvi.presentation.favourite

import com.example.weathercomposemvi.domain.entity.City
import kotlinx.coroutines.flow.StateFlow

interface FavouriteComponent {

    val model: StateFlow<FavouriteStore.State>

    fun onClickSearch()

    fun onClickAddFavourite()

    fun onCityItemClick(city: City)
}