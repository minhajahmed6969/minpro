package com.ttt.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPage {
	
	WebDriver driver;
	public MyPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	@FindBy (xpath = "//input[@id='gh-ac']")
		
	WebElement tbox_email;
	
	public WebElement gettbox_email(){
		
		return tbox_email;
	}
	
	
	
	
	}
	


