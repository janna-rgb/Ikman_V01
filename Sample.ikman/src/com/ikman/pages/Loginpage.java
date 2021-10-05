package com.ikman.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	
	WebDriver driver;
	
	
	//Constructor of Loginpage class
	public Loginpage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	@FindBy(how=How.XPATH,using="//button[@class='btn--1gFez secondary--Os-e9 background--2lR9B small--1MQ15 accept-button--3x6yl']")
	WebElement accept_cookies;
	@CacheLookup
	
	@FindBy(how=How.LINK_TEXT,using="Login")
	WebElement login_link;
	@CacheLookup
	
	@FindBy(how=How.XPATH,using="//div[@class='gtm-email-login']")
	WebElement cont_email;
	@CacheLookup
	
	@FindBy(how=How.ID,using="input_email")
	WebElement email;
	@CacheLookup
	
	@FindBy(how=How.ID,using="input_password")
	WebElement password;
	@CacheLookup
	
	@FindBy(how=How.XPATH,using="//button[contains(@class,'gtm-email-login')]")
	WebElement login;
	
	
	
	public void login_click() 
	{
		accept_cookies.click();
		login_link.click();
		
		cont_email.click();
	}
	
	public void email_login(String mail_id , String ps_id)
	
	{
		email.sendKeys(mail_id);
		password.sendKeys(ps_id);
		login.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
