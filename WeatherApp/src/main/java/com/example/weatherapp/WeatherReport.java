package com.example.weatherapp;

import lombok.Data;

import java.io.Serializable;

@Data
public class WeatherReport implements Serializable {
    private CurrentWeather current;
}
