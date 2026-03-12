package com.example.alpha.rest;


import com.example.alpha.common.FrenchChef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import util.Chef;


@RestController
public class DemoController {

    public FrenchChef frenchChef;

    private Chef myChef;
    private Chef secondChef;

    @Autowired
    public DemoController(@Qualifier("frenchChef") Chef theChef,
                          @Qualifier("frenchChef") Chef theSecondChef) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myChef = theChef;
        secondChef = theSecondChef;
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myChef == secondChef, " + (myChef == secondChef);
    }

    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();
    }
}
