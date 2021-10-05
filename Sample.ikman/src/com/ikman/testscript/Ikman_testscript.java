package com.ikman.testscript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ikman.pages.Loginpage;
import com.ikman.pages.Logout;
import com.ikman.pages.PostAd;
import com.ikman.pages.PropertyDetails;


public class Ikman_testscript {
	

  static WebDriver driver;
  	
	
  
  @BeforeTest
  public void setup()
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ziyam Jahees Buhary\\Desktop\\Virtusa Training\\Eclipseworkspace\\Sample.ikman\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
  }
	
  
  	@Parameters({"url", "uid"})
	@Test
	public void login_to_ikman(String url, String uid) throws InterruptedException  
	{
		
		//launch browser and specific url
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ziyam Jahees Buhary\\Desktop\\Virtusa Training\\Eclipseworkspace\\Sample.ikman\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();*/
		
		driver.manage().window().maximize();
		driver.get(url);
		//driver.findElement(By.xpath("//button[@class='btn--1gFez secondary--Os-e9 background--2lR9B small--1MQ15 accept-button--3x6yl']")).click();
	
		//create page object for loginpage using Page Factory
		Loginpage login_page = PageFactory.initElements(driver, Loginpage.class);
	
		//Navigate to login link and click
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		login_page.login_click();
		login_page.email_login(uid, "1qaz2wsx!@#");
		 
		
	}
	
	
	 @Test
	 public void post_ikman() throws InterruptedException
	   	{
		  
		PostAd post_ad_ikman = PageFactory.initElements(driver, PostAd.class);
		Thread.sleep(2000);
		post_ad_ikman.post_property();
		Thread.sleep(3000);
		
	   	}
	 
	 
	 @Test
	 public void setproperty_details() throws InterruptedException
	 {
		 PropertyDetails prop = PageFactory.initElements(driver, PropertyDetails.class); 
		
		 prop.property_details();
		 
		 Thread.sleep(2000);
	 }
		


	
	//method for logout 
	 @AfterTest
	 public static void logout_ikman()
   	{
	  
		 Logout logout_page = PageFactory.initElements(driver, Logout.class);
		 //Thread.sleep(3000);
		 logout_page.logout();
		 driver.close();
	
   	}
	
	
}

