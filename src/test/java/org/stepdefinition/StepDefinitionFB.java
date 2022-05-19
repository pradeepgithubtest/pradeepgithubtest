package org.stepdefinition;

import org.baseclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionFB extends BaseClass {
	
	@Given("User is on the facebook login page")
	public void user_is_on_the_facebook_login_page() {
		//git conflict test
		browserLaunch("https://en-gb.facebook.com/\r\n");
		System.out.println("Browser Launched Successfully");
		
	}
	@When("User should enter the {string} and {string}")
	public void user_should_enter_the_and(String username, String password) {
		findElementId("email").sendKeys(username);
		findElementId("pass").sendKeys(password);
	}
	
//	@When("User should enter the username and password")
//	public void user_should_enter_the_usernameand_password() {
//		findElementId("email").sendKeys("Pradeep");
//		findElementId("pass").sendKeys("Pradeep@123");
//		
//	}

	@When("User should click the login buton")
	public void user_should_click_the_login_buton() {
		findElementId1("//a[text()='Create New Account']").click();
		
	}

	@Then("User should verify the success message")
	public void user_should_verify_the_success_message() {
		

	}
	}
