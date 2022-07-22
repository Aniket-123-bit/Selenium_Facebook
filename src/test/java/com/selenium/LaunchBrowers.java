package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowers {
	@Test
	public void launch() {
		String key ="webdriver.chrome.driver";
		String value="C:\\Users\\ac\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title ;
		title=driver.getTitle();
		System.out.println(title);
		String pageSource;
		pageSource=driver.getPageSource();
		System.out.println(pageSource);
		String currentUrl;
		currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		//navigate site
		driver.navigate().to("https://www.flipkart.com/") ;
		
		 String fktitle = driver.getTitle();
		 System.out.println("The title of the page is :"+fktitle);
		
		 driver.navigate().back();
	
		 driver.navigate().forward();
	
		 driver.navigate().refresh();
	
		 
		 
		driver.close();
	
		
		
	}

	

}
