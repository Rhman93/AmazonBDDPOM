package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/ahmedshuily/eclipse-workspace/"
		+ "Aug20Batch BDD POM/src/main/java/features",
		glue="step_Definations",
		plugin = {"pretty", "html:target/Amazon-report"},
		monochrome = true)

public class TestRunner {

}
