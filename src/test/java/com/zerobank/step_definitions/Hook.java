package com.zerobank.step_definitions;

import com.zerobank.utilities.Driver;
import io.cucumber.java.Before;

public class Hook {

    @Before
    public void setup(){
        System.out.println("#####################################");
        System.out.println("Test setup!");
        Driver.get().manage().window().maximize();
    }
}
