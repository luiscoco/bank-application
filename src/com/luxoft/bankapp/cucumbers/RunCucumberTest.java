package com.luxoft.bankapp.cucumbers;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.luxoft.bankapp.cucumbers.steps"
)
public class RunCucumberTest {
}
