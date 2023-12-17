package com.example.weatherapp;

import lombok.Data;

@Data
public class CurrentWeather {
    private long temp_c;

    private long wind_kph;

    private String wind_dir;


}
