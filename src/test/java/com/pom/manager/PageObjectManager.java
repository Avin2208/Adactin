package com.pom.manager;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.LoginPage;

public class PageObjectManager {

	
	public static WebDriver driver;
	
	private LoginPage lp;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public LoginPage getLp() {
		lp = new LoginPage(driver);
		return lp;
	}

	public void page (LoginPage lp) {
		this.lp = lp;
	}
	
}
