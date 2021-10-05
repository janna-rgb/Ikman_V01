package com.ikman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.CacheLookup;

public class Logout {
	
	WebDriver driver;
	
	//Constructor of Logout class
	public Logout(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="My account")
	WebElement myaccount;
	@CacheLookup
	
	@FindBy(how=How.XPATH,using="//a[@href='/en/my/settings']")
	WebElement setting;
	@CacheLookup
	
	@FindBy(how=How.XPATH,using="//a[@href='/en/users/logout']")
	WebElement logout_button;
	
	
	//method to logout
	public void logout()
	{
		myaccount.click();
		setting.click();
		logout_button.click();
		
	}
	
	
	

}
