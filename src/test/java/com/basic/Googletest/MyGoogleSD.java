package com.basic.Googletest;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class MyGoogleSD {
	Response res;
	@Given("^user should be in the google page$")
	public void user_should_be_in_the_google_page() {//throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hitting google.com");
		res=RestAssured.given().get("https://www.google.com");
	    //throw new PendingException();
	}

	@Then("^i want to check the  \"([^\"]*)\" status$")
	public void i_want_to_check_the_status(String arg1) {//throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Validation status code");
		int stCode = res.getStatusCode();
		String ssstCode
		Assert.assertEquals(200, stCode);
	   //throw new PendingException();
	}
}
}


