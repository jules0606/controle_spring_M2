package com.example.controle_spring_m2.controller;

import com.example.controle_spring_m2.dto.Weather;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WeatherController {

    static List<Weather> meteos = new ArrayList<Weather>(){
        {
            final Weather weather1 = new Weather("Saint-Cézaire", "06530", "+20", "sunny", "FR");
            final Weather weather2 = new Weather("Nice", "06000", "+25", "sunny", "FR");
            final Weather weather3 = new Weather("NewYork", "10005", "+10", "rainy", "USA");
            add(weather1);
            add(weather2);
            add(weather3);
        }
    };

    @GetMapping(value = "/weathers")
    public List<Weather> getWeather() {
        System.out.println("Getting all weathers");
        return meteos;
    }


    @GetMapping(value = "/weatherByName/{name}")
    public Weather[] getWeatherByName(@PathVariable String name) {
        Weather[] response = meteos.stream().filter(x -> x.getNomVille().equals(name)).toArray(Weather[]::new);
        if(response.length < 1) {
            return null;
        }
        return response;
    }

    @GetMapping(value = "/weatherByZipCode/{zip}")
    public Weather[] getWeatherByZipCode(@PathVariable String zip) {
        System.out.println("Getting all weathers");
        Weather[] response = meteos.stream().filter(x -> x.getZipCode().equals(zip)).toArray(Weather[]::new);
        if(response.length < 1) {
            return null;
        }
        return response;
    }

    @GetMapping(value = "/weatherByCountry/{pays}")
    public Weather[] getWeatherByCountry(@PathVariable String pays) {
        System.out.println("Getting all weathers");
        Weather[] response = meteos.stream().filter(x -> x.getPays().equals(pays)).toArray(Weather[]::new);
        if(response.length < 1) {
            return null;
        }
        return response;
    }

}
