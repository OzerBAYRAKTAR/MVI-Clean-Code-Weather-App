package com.example.kotlinweatherappretrof.di


import com.example.kotlinweatherappretrof.data.repository.WeatherRepositoryImpl
import com.example.kotlinweatherappretrof.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindLocationTracker(
       weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}