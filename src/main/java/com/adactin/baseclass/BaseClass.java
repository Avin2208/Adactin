package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class BaseClass {
	public static WebDriver driver;
	private static Object url;
	public static WebDriver getbrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
			 driver = new ChromeDriver();
			}
			else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.edge.driver", 
			          System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));          
				driver = new EdgeDriver();
					
			}else {
				System.out.println("invalid browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public void geturl(String url) {
		driver.get(url);

	}
	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void close() {
	driver.close();	
	
	}
	
	public static void Quit() {
	driver.quit();
	}
	
	public static void NavigateTo(String to) {
	driver.navigate().to(to);
	}

	public static void ClickElement(WebElement element) {
		element.click();
	}
	public static void NavigateBack(String Back) {
	driver.navigate().back();	
	}
	public static void NavigateForward() {
	driver.navigate().forward();	
	}
	
	public static void NavigateRefresh() {
	driver.navigate().refresh();	
	}
	
	public static void Alert_accept() {
	driver.switchTo().alert().accept();	
	}
	public static void Alert_dismiss() {
	driver.switchTo().alert().dismiss();
	}
	public static void AlretWithtext(String value) {
	driver.switchTo().alert().sendKeys("hi");
	driver.switchTo().alert().accept();
	}
	
	public static void RightClick( WebElement click) {
		
	Actions a = new Actions(driver);
	a.contextClick(click).perform();
	}
	
	public static void DoubleClick(WebElement DoubleClick) {
	Actions a = new Actions(driver);
	a.doubleClick(DoubleClick).perform();
	}
	
	public static void MouseOver(WebElement element) {
	Actions a = new Actions(driver);
	a.moveToElement(element).perform();
	}
	
	public static void DragandDrop(WebElement drag, WebElement drop) {
	Actions a = new Actions(driver);
	a.dragAndDrop(drag, drop).perform();
	}
	
	public static void CheckBox(WebElement url) {
	url.click();

	}	
	
	public static void IsEnabled(WebElement element) {
	element.isEnabled();	
	}
	
	public static void GetTitle() {
	System.out.println("page title = "+driver.getTitle());
	}
	
	public static void GetCurrenturl() {
	System.out.println("Current url = "+driver.getCurrentUrl() );
	}
	
	public static void GetText(WebElement text) {
	System.out.println("Text = "+text.getText());
	}
	
	public static void GetAttribute(WebElement Attribute, String url) {
	System.out.println("Attribute is :"+Attribute.getAttribute(url) );
	}	
	public static void ScreenShot() throws Throwable {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File srcfile = ts.getScreenshotAs(OutputType.FILE);
	File dstfile = new File("C:\\Users\\User\\eclipse oldversion\\SeleniumFirst\\Screenshot/an.png");
	FileUtils.copyFile(srcfile, dstfile);
	}
	
	public static void ScrollDown(WebElement scrolldown) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", scrolldown);
	}
	public static void ScrollUp(WebElement scrollup) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", scrollup);
	
	}
	public static void DropDown(WebElement Dropdown, String el) {
	Select s = new Select(Dropdown);
	s.selectByValue(el);
	//s.selectByVisibleText(el);
	//s.selectByIndex(value);
	}
	public static void SingleFrame(WebElement singleiframe) {
	driver.switchTo().frame(singleiframe);
	}
	
	public static void DoubleFrame(WebElement Doubleframe, WebElement singleframe) {
	driver.switchTo().frame(Doubleframe);
	driver.switchTo().frame(singleframe);
	}
	public static void Robot() throws AWTException {
	Robot r = new Robot();
	
	for (int i = 0; i < 11; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);	
	}
	
	r.keyPress(KeyEvent.VK_ENTER);

	}
	public static void IsEnabled1(WebElement element) {
		boolean eleEnabled= element.isEnabled();
		System.out.println(eleEnabled);
	}
		
	
	
	
	public static void IsDisplayed(WebElement element, String given) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);

	}

	public static void IsSelected(WebElement element) {
		boolean elePresent = element.isSelected();	
		System.out.println(elePresent);
	}
	public static void GetOptions(WebElement element) {
	      Select s = new Select(element);
	      List <WebElement> op = s.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	      }
	}
	
	public static void GetFirstSelectedOptions(WebElement element) {
		 //WebElement t=driver.findElement(By.xpath("//*[@name='continents']"));
		 Select sel = new Select(element);
		  WebElement s =  sel.getFirstSelectedOption();
		  String selectedoption = s.getText();
	      System.out.println("Selected element: " + selectedoption);
		 
		 
	}
	
	public static void GetAllSelectedOptions(WebElement element) {
		 Select sel = new Select(element);
		  WebElement s =  (WebElement) sel.getAllSelectedOptions();
		  String selectedoption = s.getText();
	      System.out.println("Selected element: " + selectedoption);	
	}
	
	//public static void Wait(WebElement element) {
		//WebDriverWait wait = new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.visibilityOf(element);
	//}
	public static void ImplicitWait() {

	}
	
}
	


