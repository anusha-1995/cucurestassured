package com.basic.AllFilesInSameFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OnefolderstepDefs {

	WebDriver driver;
	
 @Given("the user is in facebook login page")
 public void the_user_is_in_facebook_login_page(){
	 System.out.println("in setup");
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\New folder 1\\chromedriver_win32_B45\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
 }
 
 @When("^he enters \"([^\"]*)\" as user name$")
 public void he_enters_as_user_name(String UserName) {
     // Write code here that turns the phrase above into concrete actions
	 
    driver.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys(UserName);
 }

 
 @When("^he enters \"([^\"]*)\" as password$")
 public void he_enters_as_password(String arg1)  {
     // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath())
     
 }

 @Then("^check username is present in textbox$")
 public void check_username_is_present_in_textbox() {
     // Write code here that turns the phrase above into concrete actions
     
 }

 
 @Then("^im check facebook login page$")
 public void im_check_facebook_login_page()  {
     // Write code here that turns the phrase above into concrete actions
    
 }
}

	
