package org.hookstest;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDef extends BaseClass {
	
	@When("User should enter the username and password")
	public void user_should_enter_the_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("PradeepGuna");
		driver.findElement(By.name("password")).sendKeys("Pradeep@123");
		
	}

	@When("User should click the signup button")
	public void user_should_click_the_signup_button() {
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		
	}

	@Then("User should verify the success message")
	public void user_should_verify_the_success_message() {
		System.out.println("Sign up sucessfully");
		
	}

}
