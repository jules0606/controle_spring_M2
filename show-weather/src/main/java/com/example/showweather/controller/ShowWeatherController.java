package com.example.showweather.controller;

import com.example.showweather.delegate.ShowWeatherDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowWeatherController {

    @Autowired
    ShowWeatherDelegate showWeatherDelegate;

    @GetMapping(value = "/getWeatherByName/{name}")
    public String getWeatherByName(@PathVariable String name) {
        return showWeatherDelegate.getWeatherByName(name);
    }

    @GetMapping(value = "/getWeatherByZipCode/{zip}")
    public String getWeatherByZipCode(@PathVariable String zip) {
        return showWeatherDelegate.getWeatherByZipCode(zip);
    }

}
