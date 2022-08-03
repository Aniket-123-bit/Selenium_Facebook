package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Email {
	@Test
	public void gmail_contextClickDemo_mailArchive() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ac\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		// enter email id
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anisunny782@gmail.com");
		// click on Next button
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(3000);
		// enter password id
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("anny123");
		// click on Next button
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);

		// Write xpath expression for the mail item based on a subject
		String xp = "(//div[contains(@role,'checkbox')])[2]";
		

		// get the address of the mail item which you want to archive
		WebElement mail = driver.findElement(By.xpath(xp));

		// print the subject of the mail
		System.out.println(mail.getText());

		// Creating an object of Actions class
		Actions actions = new Actions(driver);

		// using Actions class object and contextClick() method, right click on the mail
		// item
		actions.contextClick(mail).perform();
		Thread.sleep(6000);

		// click on Archive to archive the mail
		//driver.findElement(By.xpath("(//div[@class='J-N-JX aDE aDD'])[1]")).click();
		
		
		
		
		
	   


	}
}
