package com.ws.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WeatherApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeatherApplication.class, args);
    }

//    @Bean
//    public SnowFlake snowFlake(ServerConfig serverConfig) {
//        return new SnowFlake(serverConfig.getDataCenterId(), serverConfig.getMachineId());
//    }
}
