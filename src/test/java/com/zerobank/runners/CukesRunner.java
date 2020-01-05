package com.zerobank.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features", //path to features
        glue = "com/zerobank/stepdefinitions",  //path to the step definitions
        dryRun =false,
        tags = "@Pay_Bill",
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        }
)

public class CukesRunner {
}
