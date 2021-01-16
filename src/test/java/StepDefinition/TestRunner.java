package StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/resources/Features",
		glue={"StepDefinition"},
		tags= {"@test1 or @test2"},
		plugin={"json:target/cucumber.json"}
		)
		

//monochrome=true,
//plugin={"pretty","html:target/HTMLReports/HtmlReports.html",
//		"json:target/JSONReports/jsonReport",
//"junit:target/JunitReports/junitReport.xml"},
//dryRun = false,

public class TestRunner {



}
