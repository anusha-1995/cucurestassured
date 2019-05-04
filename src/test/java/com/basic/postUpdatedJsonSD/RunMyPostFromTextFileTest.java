package com.basic.postUpdatedJsonSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			features= {"src/test/java/com/basic/postStringJsonSD/PostFromTextFile.feature"},//path should be taken from feature file properties
			glue={"com/basic/postStringJsonSD/"},//path should be taken from name of the package
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report4.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunMyPostFromTextFileTest {


}
