package com.example.weatherapp.domain.model

data class WeatherInfo(

    val temperature: Double,
    val weatherStatus: String,
    val minTemperature: Double,
    val maxTemperature: Double,
    val feelsLike: Double,
    val humidity: Int,
    val pressure: Int,
    val windSpeed: Double,
    val windGust: Double,

    )
