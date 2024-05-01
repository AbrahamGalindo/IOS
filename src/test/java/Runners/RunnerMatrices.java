package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@matrices",
        features = {"./src/test/resources/Features/Matrices.feature"},
        glue = "StepDefinitions",
        plugin = {"summary", "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class RunnerMatrices {
}
