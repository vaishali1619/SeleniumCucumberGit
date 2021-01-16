package StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/resources/Features/Hooks/hooks.feature",
		glue={"stepsforHooks"},
		tags= {"@tag"},
		plugin={"pretty","html:target/HTMLReports/hooksreport.html"}
		)


public class RunnerforHooks {

}
