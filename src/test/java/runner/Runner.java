package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = {"steps", "hooks"},
        plugin = {"json:build/cucumber.json",
                "html:build/site/cucumber-pretty",
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"})
public class Runner {

}