package org.hookstest1;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hi\\eclipse-workspace\\CucumberTesting\\Pradeep\\Hooks.feature",glue="org.hookstest",monochrome=true)

public class HooksRunner {

}
