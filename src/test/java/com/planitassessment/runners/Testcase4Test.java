package com.planitassessment.runners;

        // import cucumber.api.CucumberOptions;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"com.planitassessment.definitions"},
        tags = {"@type=testcase3"}
)
public class Testcase3Test {
    public Testcase3Test() {
    }
}
