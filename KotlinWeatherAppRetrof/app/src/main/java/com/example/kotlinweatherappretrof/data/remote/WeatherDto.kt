package com.example.kotlinweatherappretrof.data.remote


import com.squareup.moshi.Json


data class WeatherDto(
    //we just want to fetch at the weatherapi's url the "hourly" parameter.
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
){

}
