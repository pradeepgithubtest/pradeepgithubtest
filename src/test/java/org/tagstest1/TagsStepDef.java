package org.tagstest1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TagsStepDef {
	
	
	@Given("User is on the facebook login pageone")
	public void user_is_on_the_facebook_login_pageone() {
		System.out.println("login pageone Reg Test");
	}

	@When("User should enter the usernameone and password")
	public void user_should_enter_the_usernameone_and_password() {
		System.out.println("usernameone and password Reg Test");
	}

	@When("User should click the create new account buttonone")
	public void user_should_click_the_create_new_account_buttonone() {
		System.out.println(" click buttonone Reg Test");
	}

	@Given("User is on the facebook login pagetwo")
	public void user_is_on_the_facebook_login_pagetwo() {
		System.out.println("login pagetwo Smoke Test");
	}

	@When("User should enter the usernametwo and password")
	public void user_should_enter_the_usernametwo_and_password() {
		System.out.println("usernametwo and password Smoke Test");
	}

	@When("User should click the create new account buttontwo")
	public void user_should_click_the_create_new_account_buttontwo() {
		System.out.println("click buttontwo Smoke Test");
	}

	@Given("User is on the facebook login pagethree")
	public void user_is_on_the_facebook_login_pagethree() {
		System.out.println("login pagethree Sanity Test");
	}

	@When("User should enter the usernamethree and password")
	public void user_should_enter_the_usernamethree_and_password() {
		System.out.println("usernamethree and password Sanity Test");
	}

	@When("User should click the create new account buttonthree")
	public void user_should_click_the_create_new_account_buttonthree() {
		System.out.println("click buttonthree Sanity Test");
	}

	@Given("User is on the facebook login pagefour")
	public void user_is_on_the_facebook_login_pagefour() {
		System.out.println("login pagefour Smoke Test");
	}

	@When("User should enter the usernamefour and password")
	public void user_should_enter_the_usernamefour_and_password() {
		System.out.println("usernamefour and password Smoke Test");
	}

	@When("User should click the create new account buttonfour")
	public void user_should_click_the_create_new_account_buttonfour() {
		System.out.println("click buttonfour Smoke Test");
}
	}
 