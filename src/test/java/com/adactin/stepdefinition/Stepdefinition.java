package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.testrunner.Testrunner;
import com.pom.manager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass{
	
	public static WebDriver driver = Testrunner.driver;
	//LoginPage lp = new LoginPage(driver);
	
	PageObjectManager pom = new PageObjectManager(driver);
//	@Given("user in on login page")
//	public void user_in_on_login_page() {
//		System.out.println("Step:url");
//		geturl("http://adactinhotelapp.com/");
//	
//	}
//
//	@When("user enters username and password")
//	public void user_enters_username_and_password() {
//		System.out.println("Step:login name");
//		//sendkeys(lp.getUsername(), "Avin2208");
//		sendkeys(pom.getLp().getUsername(), "Avin2208");
//	}
//
//	@When("clicks on login button")
//	public void clicks_on_login_button() {
//		System.out.println("Step:login password");
////		sendkeys(lp.getPassword(), "220897");
//	sendkeys(pom.getLp().getPassword(), "220897");
//	}
//
//	@Then("user is navigate to the home page")
//	public void user_is_navigate_to_the_home_page() {
//		System.out.println("Step: login button");
//		//ClickElement(lp.getLogin());
//		ClickElement(pom.getLp().getLogin());
//		}
//	@Given("user in on login page")
//	public void user_in_on_login_page() {
//		System.out.println("Step:url");
//		geturl("http://adactinhotelapp.com/");
//	}
//	@When("user enters username and password")
//	public void user_enters_username_and_password() {
//		System.out.println("Step:login name");
//		sendkeys(pom.getLp().getUsername(), "Avin2208");
//		
//	}
//	@When("clicks on login button")
//	public void clicks_on_login_button() {
//	
//		System.out.println("Step:login password");
//		sendkeys(pom.getLp().getPassword(), "220897");
//		
//	}
//	
//	@Then("user is navigate to the home page")
//	public void user_is_navigate_to_the_home_page() {
//		System.out.println("Step: login button");
//		ClickElement(pom.getLp().getLogin());
//		}


@Given("user in on login page")
public void user_in_on_login_page() {
	System.out.println("Step:url");
	geturl("http://adactinhotelapp.com/");

}

@When("user enters username {string}")
public void user_enters_username(String string) {
	System.out.println("Step:login name");
	sendkeys(pom.getLp().getUsername(), string);
}

@When("user enters password {string}")
public void user_enters_password(String string1) {
	System.out.println("Step:login name");
	sendkeys(pom.getLp().getPassword(), string1);

}

@When("clicks on login button")
public void clicks_on_login_button() {
	System.out.println("Step: login button");
	ClickElement(pom.getLp().getLogin());

}

@Then("user is navigate to the home page")
public void user_is_navigate_to_the_home_page() {
	System.out.println("step: user navigate to page");


}

	
	
}
