package org.hookstest;

import org.baseclass.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass{
	
	@Before
	public void beforLogin() {
		browserLaunch("https://www.instagram.com/");
			
	}
	@After
	public void afterExecution() {

	}

}
