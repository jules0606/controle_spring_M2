package com.example.showweather.delegate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ShowWeatherDelegate {

    @Autowired
    @Lazy
    RestTemplate restTemplate;

    // implement a callStudentService method and enabled it by hystrix. we wanna return student detail with a normal flow
    // this a http exchange
    @HystrixCommand(fallbackMethod = "callFailed")
    public String getWeatherByName(String name){
        return restTemplate.getForObject("http://localhost:10005/weatherByName/" + name, String.class);
    }

    @HystrixCommand(fallbackMethod = "callFailed")
    public String getWeatherByZipCode(String zip){
        return restTemplate.getForObject("http://localhost:10005/weatherByZipCode/" + zip, String.class);
    }

    // implement a fallback method
    public String callFailed(String str) {
        return "SERVICE UNAVAILABLE";
    }

    // this is a bean
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
