package com.example.weatherapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WeatherPrint {
    @Autowired
    private final WeatherApi weatherApi;

    public WeatherPrint(WeatherApi weatherApi) {
        this.weatherApi = weatherApi;
    }

    @Scheduled(fixedRate = 10000)
    public void printWeatherConsole(){
        WeatherReport weatherReport = weatherApi.getWeather("London");
        System.out.printf(weatherReport.toString());
    }
}
