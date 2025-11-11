package com.example.weathercomposemvi.di

import android.content.Context
import com.example.weathercomposemvi.data.local.db.FavouriteCitiesDao
import com.example.weathercomposemvi.data.local.db.FavouriteDatabase
import com.example.weathercomposemvi.data.network.api.ApiFactory
import com.example.weathercomposemvi.data.repository.FavouriteRepositoryImpl
import com.example.weathercomposemvi.data.repository.SearchRepositoryImpl
import com.example.weathercomposemvi.data.repository.WeatherRepositoryImpl
import com.example.weathercomposemvi.domain.repository.FavouriteRepository
import com.example.weathercomposemvi.domain.repository.SearchRepository
import com.example.weathercomposemvi.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindFavouriteRepository(impl: FavouriteRepositoryImpl): FavouriteRepository

    @ApplicationScope
    @Binds
    fun bindSearchRepository(impl: SearchRepositoryImpl): SearchRepository

    @ApplicationScope
    @Binds
    fun bindWeatherRepository(impl: WeatherRepositoryImpl): WeatherRepository

    companion object {

        @ApplicationScope
        @Provides
        fun provideApiService() = ApiFactory.apiService

        @ApplicationScope
        @Provides
        fun provideFavouriteDatabase(context: Context): FavouriteDatabase {
            return FavouriteDatabase.getInstance(context)
        }

        @ApplicationScope
        @Provides
        fun provideFavouriteCitiesDao(database: FavouriteDatabase): FavouriteCitiesDao {
            return database.favouriteCitiesDao()
        }
    }
}