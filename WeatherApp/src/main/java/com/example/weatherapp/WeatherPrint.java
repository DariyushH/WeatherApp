package com.example.weatherapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WeatherPrint {
    @Autowired
    private WeatherApi weatherApi;

    @Scheduled(fixedRate = 10000)
    public void printWetherConsole(){
        String weather = weatherApi.getWeather();
        System.out.printf(weather);
    }
}
