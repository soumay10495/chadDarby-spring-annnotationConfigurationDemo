package com.springDemo;

import org.springframework.beans.factory.annotation.Value;

public class SportCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${team.name}")
    private String name;

    @Value("${team.email}")
    private String email;

    public SportCoach(FortuneService sadFortuneService) {
        this.fortuneService = sadFortuneService;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim for 30 mins";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }
}
