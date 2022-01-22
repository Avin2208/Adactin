package com.adactin.testrunner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.File_Reader_Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature//login.feature",
		glue = "com\\adactin\\stepdefinition",
		plugin = {"pretty", "html:Report\\CucumberReport", 
				"json:Report\\Cucumber.json"},
				//"com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html"},
		monochrome = true,
		dryRun = false)


public class Testrunner {
	public static WebDriver driver;
	 
	@BeforeClass
	public static void Set_up() throws Throwable {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser(); 
		 driver = BaseClass.getbrowser(browser);
		
	}



}
