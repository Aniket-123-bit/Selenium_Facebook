package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
	public static WebDriver driver;
	@BeforeTest
	public void launchrowser(){
	
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
}
	@Test
	public void autoIt_UploadFile() throws InterruptedException, IOException {
		driver.get("https://www.freepdfconvert.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Choose file")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("file:///C:/Users/ac/Downloads/Aniket's%20Resume%20(2).pdf");
	}
	@Test
	public void file_Upload() throws InterruptedException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("file:///C:/Users/ac/Downloads/Aniket's%20Resume%20(2).pdf");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[@ng-click=\\\"item.upload()\\\"]")).click();
	//Thread.sleep(2000);

	}
}
