package com.example.alpha.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;
import util.Chef;

@Component
public class FrenchChef implements Chef {

    public FrenchChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "French Chef prepare un baquete";
    }
}

