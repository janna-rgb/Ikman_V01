package com.ikman.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PropertyDetails {

	WebDriver driver;
	
	
	public PropertyDetails(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	//locator for Bedroom
		@FindBy(how=How.NAME,using="bedrooms")
		WebElement bedroom;
		@CacheLookup
	
		
	//locator for Bedroom number	
		@FindBy(how=How.XPATH,using="//li[@id='downshift-1-item-1']/div")
		WebElement bedroom_no;
		@CacheLookup
		
	//locator for Bathroom 	
		@FindBy(how=How.XPATH,using="//button[@name='bathrooms']")
		WebElement bathroom;
		@CacheLookup
		
	//locator for Bathroom number	
		@FindBy(how=How.XPATH,using="//ul[@class='menu--1PZC_']//li/div") List<WebElement> bathrooms_no ;
		WebElement bathroom_no;
		@CacheLookup
		
	//locator for landsize 	
		@FindBy(how=How.ID,using="input_land_size") 
		WebElement land_size;
		@CacheLookup
		
	//locator for landsize 	
		@FindBy(how=How.XPATH,using="//button[@name='land_size-unit']") 
		WebElement land_size_u;
		@CacheLookup
		
	//locator for landsizeunits	value
		@FindBy(how=How.XPATH,using="//ul[@class='menu--1PZC_']//li/div") List<WebElement> land_size_units1 ;
		WebElement land_size_unit;
		@CacheLookup
		
	//locator for house size 
		@FindBy(how=How.ID,using="input_house_size") 
		WebElement house_size;
		@CacheLookup
		
	//locator for input address 
		@FindBy(how=How.ID,using="input_address") 
		WebElement house_address;
		@CacheLookup
				
	//locator for input title 
		@FindBy(how=How.ID,using="input_title") 
		WebElement input_title;
		@CacheLookup
		
	//locator for Description 
		@FindBy(how=How.XPATH,using="//textarea[@name='description']") 
		WebElement description;
		@CacheLookup
		
	//locator for Price
		@FindBy(how=How.ID,using="input_price") 
		WebElement price;
		@CacheLookup
		
	//locator for Negotiable checkbox
		@FindBy(how=How.XPATH,using="//label[@for='negotiable']") 
		WebElement negotiable;
		@CacheLookup
		
	//locator for Image upload
		@FindBy(how=How.ID,using="input_image_upload") 
		WebElement image_upload;
	//	@CacheLookup	
		
		public void property_details()
		{
					
			
			try {
			    WebElement bd = bedroom;
			    bd.click();
			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
			    WebElement bd = bedroom;
			    bd.click();
			}
			
			
			
			bedroom_no.click();
			 
			 
			bathroom.click();
//			 List<WebElement> bathrooms_no =driver.findElements(By.xpath("//ul[@class='menu--1PZC_']//li/div"));
				
			//for loop for getting the value "2"
			for (WebElement bath:bathrooms_no)
				{
					String innerHTML = bath.getAttribute("innerHTML");
					if (innerHTML.contentEquals("2"))
					{
						
						bath.click();
						break;
					}
					
				}
			
			
			
			land_size.sendKeys("6");
			
			//selecting Land Unit
			
			land_size_u.click();
			//List<WebElement> land_unit =driver.findElements(By.xpath("//ul[@class='menu--1PZC_']//li/div"));
			
			for (WebElement land_unit:land_size_units1)
			{
				String innerHTML = land_unit.getAttribute("innerHTML");
				if (innerHTML.contentEquals("perches"))
				{
					
					land_unit.click();
					break;
				}
				
			}
			
			
			house_size.sendKeys("19,058.0");
			
			house_address.sendKeys("123/9/A, Keppetipola Garden, Dehiwala");
			
			input_title.sendKeys("Modern House For Sale In Dehiwela");
			
			description.sendKeys("Architecture Designed 2 Story House For Sale in Kalalgoda. IDEAL FOR RESIDENCE / RESIDENCE OFFICE OR ANY RESIDENTIAL WORK....HIGHLY RESIDENTIAL AREA ");
			
			price.sendKeys("28,000,000");
			
			negotiable.click();
			
		//scroll down
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			
			image_upload.sendKeys("C:\\Users\\Ziyam Jahees Buhary\\Desktop\\Renovation\\sample pics\\hatch 2.JPG");
			image_upload.sendKeys("C:\\Users\\Ziyam Jahees Buhary\\Desktop\\Renovation\\sample pics\\hatch.JPG");
			image_upload.sendKeys("C:\\Users\\Ziyam Jahees Buhary\\Desktop\\Renovation\\sample pics\\amano2.JPG");
			image_upload.sendKeys("C:\\Users\\Ziyam Jahees Buhary\\Desktop\\Renovation\\sample pics\\window3.JPG");
			image_upload.sendKeys("C:\\Users\\Ziyam Jahees Buhary\\Desktop\\Renovation\\sample pics\\amano1.JPG");
		}

}
