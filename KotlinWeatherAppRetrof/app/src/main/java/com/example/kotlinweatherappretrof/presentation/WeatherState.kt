package com.example.kotlinweatherappretrof.presentation

import com.example.kotlinweatherappretrof.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo?=null,
    val isLoading:Boolean=false,
    val error:String?=null
)