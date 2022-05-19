package org.runnertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hi\\eclipse-workspace\\CucumberTesting\\src\\test\\"
		+ "resources\\ScenarioOutlineFolder\\ScenarioOutline.feature",glue="org.stepdefinition",monochrome=true)

public class TestRunnerClass {

}
