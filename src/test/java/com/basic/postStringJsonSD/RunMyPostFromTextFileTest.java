package com.basic.postStringJsonSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/java/com/basic/postStringJsonSD/PostFromTextFile.feature"},//path should be taken from feature file properties
		glue={"com/basic/postStringJsonSD/"}//path should be taken from name of the package
		
		)
		

public class RunMyPostFromTextFileTest {


}
