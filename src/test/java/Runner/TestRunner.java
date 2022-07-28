package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
        features = "C:\\Users\\kalpe\\eclipse-workspace\\Sample\\Feature\\com.feature", // Location of feature file
		
	    //plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		
		//plugin = {"html:target/cucumber-html-report"},
		
		glue= {"Step"}, // The path of the step definition file
		
		//format = {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		
		monochrome = true, // display the console output in a proper readable format
		
	    //strict = true, // it will check if any step is not def in step definition file
	    
		dryRun = false, // to check the mapping is proper between feature file and step def file
		
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty"}
        
		)

public class TestRunner {

}

