package com.springDemo;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You will have a sad day";
    }
}
