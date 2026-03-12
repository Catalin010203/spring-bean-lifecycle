package com.example.alpha.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    @PostConstruct
    public void initializeBean() {
        System.out.println("Bean initialized: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Bean destroyed: " + getClass().getSimpleName());
    }


}

