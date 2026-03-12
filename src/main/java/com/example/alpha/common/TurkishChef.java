package com.example.alpha.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import util.Chef;

@Component
public class TurkishChef implements Chef {

    public TurkishChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Turkish Chef makes kebab";
    }
}
