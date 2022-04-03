package com.example.weatherapp.domain

import com.example.weatherapp.domain.model.WeatherInfo

interface MainInteractor {

    fun getWeatherInfo(city: String): List<WeatherInfo>

    fun getActualDate()

}