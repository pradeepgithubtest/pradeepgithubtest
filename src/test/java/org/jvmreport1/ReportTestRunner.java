package org.jvmreport1;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreport.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hi\\eclipse-workspace\\CucumberTesting\\Pradeep\\Instagram.feature",glue="org.jvmreport",
         monochrome=true,plugin= {"pretty","Json:\\Users\\hi\\eclipse-workspace\\CucumberTesting\\Pradeep\\jvm.json"})
public class ReportTestRunner {
	
	@AfterClass
	public static void genJvmReport() {
		
		
		JvmReport.genReport("C:\\Users\\hi\\eclipse-workspace\\CucumberTesting\\Pradeep\\jvm.json");
		
		
	}

}
