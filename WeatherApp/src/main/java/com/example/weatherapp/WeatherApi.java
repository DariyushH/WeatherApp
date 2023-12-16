package com.example.weatherapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Component
public class WeatherApi {
    @Value("${weather.api.key}")
    private String apiKey;
    private final RestTemplate restTemplate ;
    @Autowired
    public WeatherApi(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getWeather(){
        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.api.weatherapi.com")
                .path("/v1/")
                .query("current.json?key={apiKey}&q=Grodno&aqi=no")
                .buildAndExpand(apiKey);
        assertEquals("http://api.weatherapi.com/v1/current.json?key=\"+apiKey+\"&q=Grodno&aqi=no", uri.toUriString());
        return restTemplate.getForObject(uri.toUriString(), String.class); //TODO Сделать получение в Java Class
    }

}
