package org.jvmreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void genReport(String jsonfile) {

	//1.To give the path of the json file
	File file = new File("C:\\Users\\hi\\eclipse-workspace\\CucumberTesting\\Pradeep");
	
	//2.To create object for configuration class
	Configuration config = new Configuration(file, "Instagram login");
	
	//3.To adding the classification
	config.addClassifications("os", "windows");
	config.addClassifications("Browser", "Chrome");
	config.addClassifications("Version", "100");
	config.addClassifications("Sprint", "7");
	config.addClassifications("Test", "Instagram Login");
	
	//4.To add Json Files
	List<String>li = new ArrayList<String>();
	li.add(jsonfile);
	
	//5.To create for ReportBuilder class 
	ReportBuilder builder = new ReportBuilder(li, config);
	
	//6.To generate jvm repirt/method call
	builder.generateReports();
	
	
	

}
}
