package com.example.alpha.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import util.Chef;

@Component
@Primary
public class MexicanChef implements Chef {

    public MexicanChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Mexican Chef prepare un tacos";
    }
}
