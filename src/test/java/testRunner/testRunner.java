package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"Features/Login.feature","Features/dashboard.feature"},
        glue = {"Stepdefinitions"},
        plugin = {
                "json:target/cucumber.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
//        tags = "@login",
        monochrome = true
)
public class testRunner {
}
