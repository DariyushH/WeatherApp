package com.example.weatherapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherApi {
    @Value("${weather.api.key}")
    private String apiKey;

    public String getWeather(){
        RestTemplate restTemplate = new RestTemplate(); //TODO вынести как Bean в конфиг класс и вынести как переменную класса, а не метода
        String url = " http://api.weatherapi.com/v1/current.json?key="+apiKey+"&q=Grodno&aqi=no"; //TODO Переделать в URI, подсказка - URIComponentsBuilder
        return restTemplate.getForObject(url, String.class);
    }


}
