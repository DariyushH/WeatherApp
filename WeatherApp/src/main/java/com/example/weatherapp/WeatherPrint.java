package com.example.weatherapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WeatherPrint {
    @Autowired
    private WeatherApi weatherApi; //TODO Autowired вынести в конструктор

    @Scheduled(fixedRate = 10000)
    public void printWetherConsole(){ //TODO название метода поменяй, неправильно Weather написал
        String weather = weatherApi.getWeather();
        System.out.printf(weather);
    }
}
