package com.basic.Googletest;


	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions( 
			features= {"src/test/resouces/com/basic/Googletest"},
	         glue= {"com/basic/Googletest/"}
			)

	public class RunMyGoogleTest {

	}


