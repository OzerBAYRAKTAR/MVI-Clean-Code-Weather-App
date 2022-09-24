package com.example.kotlinweatherappretrof.data.repository

import com.example.kotlinweatherappretrof.data.remote.WeatherApi
import com.example.kotlinweatherappretrof.data.mappers.toWeatherInfo
import com.example.kotlinweatherappretrof.domain.repository.WeatherRepository
import com.example.kotlinweatherappretrof.domain.util.Resource
import com.example.kotlinweatherappretrof.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}