package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public static WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement Username;

	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement login;

	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}