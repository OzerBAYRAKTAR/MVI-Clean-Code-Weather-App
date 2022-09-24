package com.example.kotlinweatherappretrof.domain.repository

import com.example.kotlinweatherappretrof.domain.util.Resource
import com.example.kotlinweatherappretrof.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat:Double, long:Double): Resource<WeatherInfo>
}