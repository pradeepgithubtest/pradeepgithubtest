package org.tagstest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hi\\eclipse-workspace\\CucumberTesting\\Pradeep\\Tags.feature",
							glue="org.tagstest1",monochrome=true,tags= {"@Reg or @Sanity or @Smoke"})
public class TagsRunner {

}
