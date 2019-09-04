package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	public JavascriptExecutor jse; 
	public WebDriver getdriver(){
		
		System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver");
		driver = new FirefoxDriver();
		jse = (JavascriptExecutor)driver;
		driver.get("http://www.ebay.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		jse.executeScript("scroll(0, 2000)");
		return driver;
		
		
		
		
		
		
	}
	

}
