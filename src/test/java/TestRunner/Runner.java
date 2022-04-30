package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/Features/Details.feature",
		glue= {"FreeCRMstepDef"},
		plugin= {"pretty","html:test-output.html", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome=true,
		dryRun=false
		
		)


public class Runner {

}
