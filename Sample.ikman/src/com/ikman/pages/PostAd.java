package com.ikman.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostAd {
	
	
	WebDriver driver;
	
	public  PostAd(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Elements for Posting an Ad
	@FindBy(how=How.LINK_TEXT,using="POST YOUR AD")
	WebElement post_ad_click;
	@CacheLookup
	
	//element for "Sell an item or Property"
	@FindBy(how=How.XPATH,using="//*[@id='app-wrapper']/div[1]/div[3]/div[2]/div[2]/div[1]/ul/li[1]/button/span")
	WebElement sell_propery;
	@CacheLookup
	
	//element for Property
	@FindBy(how=How.XPATH,using="(.//*[normalize-space(text()) and normalize-space(.)='Vehicles'])[1]/following::button[1]")
	WebElement propery;
	@CacheLookup
		
	//element for "Houses for Sale"
	@FindBy(how=How.XPATH,using="(.//*[normalize-space(text()) and normalize-space(.)='Land'])[1]/following::div[2]")
	WebElement house_for_sale;
	@CacheLookup
	
	//element for "District"
	@FindBy(how=How.XPATH,using="(.//*[normalize-space(text()) and normalize-space(.)='Districts'])[1]/following::div[2]")
	WebElement district;
	@CacheLookup
	
	//element for "Colombo"
	@FindBy(how=How.XPATH,using="(.//*[normalize-space(text()) and normalize-space(.)='Copyright © Saltside Technologies'])[2]/following::button[1]")
	WebElement colombo;
	@CacheLookup
	
	
	//element for "Dehiwala"
	@FindBy(how=How.XPATH,using="(.//*[normalize-space(text()) and normalize-space(.)='Maharagama'])[1]/following::div[2]")
	WebElement dehiwala;
	@CacheLookup
	
	//element for Bedroom
	@FindBy(how=How.XPATH,using="(//button[@name='bedrooms']")
	WebElement bedroom;
	
	
	
	
	
	
	public void post_property() throws InterruptedException
	{
		post_ad_click.click();
		sell_propery.click();
		propery.click();
		house_for_sale.click();
		district.click();
		colombo.click();
		dehiwala.click();
		Thread.sleep(1000);					
		
	}
	
	
	
	
}
