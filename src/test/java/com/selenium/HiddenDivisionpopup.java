package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenDivisionpopup {
	@Test
	public void main() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ac\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cleartrip.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	}

}
