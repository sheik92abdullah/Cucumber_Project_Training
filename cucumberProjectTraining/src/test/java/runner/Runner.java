package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "featureFiles" , 
				 glue = "stepDefinitions" , 
				 stepNotifications = true ,
				 dryRun = true ,
				 monochrome = true ,
				 plugin = {"pretty" , "html:report/WebReport", "json:report/jsonreport.json"} ,
				 tags = "@googleSearch or @dataDriven" )
public class Runner {

	// it should combine feature file and step definition
	// define the Runner 
	

	}

 
