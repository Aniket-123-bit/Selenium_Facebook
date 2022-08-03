package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PopUps {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\ac\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void simpleAlertPopUp() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	@Test
	public void conformationPopUp() throws InterruptedException {
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("confirmalertbox")).click();
		Thread.sleep(2000);
		Alert confirmationAlert = driver.switchTo().alert();
		String alertText = confirmationAlert.getText();
		System.out.println("the alert test is: " + alertText);
		confirmationAlert.accept();

	}

	@Test
	public void promptPopUp() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		promptAlert.sendKeys("Anny");
		Thread.sleep(2000);
		promptAlert.accept();

	}
	@Test
	public void fileUpload() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\ac\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(200);
		driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("file:///C:/Users/ac/Downloads/Aniket's%20Resume%20(2).pdf");
	}
	
	

}
