package com.stepdef;

import org.openqa.selenium.By;

import com.common.Base;
import com.ttt.page.MyPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInStepDef extends Base {
	
	MyPage mp;
	
	
	
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		driver = getdriver();
		
	}

	@When("^I click on the search box$")
	public void i_click_on_the_search_box() throws Throwable {
	    //driver.findElement(By.xpath("//input[@id='gh-ac']")).click();
		mp = new MyPage(driver);
		mp.gettbox_email().sendKeys("Watch");
		
		
	    
	}

	@When("^I type text$")
	public void i_type_text() throws Throwable {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("watch");
		
	    
	    
	}

	@When("^I click on the search button$")
	public void i_click_on_the_search_button() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
	    
	    
	}

	@When("^I load the page$")
	public void i_load_the_page() throws Throwable {
	    
	    
	}

	@When("^I scroll down the page$")
	public void i_scroll_down_the_page() throws Throwable {
		driver.findElement(By.id("w_1565194873344_cbx")).click();
	    
	    
	}

	@When("^I click on the Box$")
	public void i_click_on_the_Box() throws Throwable {
	    
	    
	}

	@Then("^I successfully see the click box search appeared$")
	public void i_successfully_see_the_click_box_search_appeared() throws Throwable {
	    
	    
	}

}
