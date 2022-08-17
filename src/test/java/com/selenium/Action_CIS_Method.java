package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_CIS_Method {
	@Test
	public void test() throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ac\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		Actions actions = new Actions(driver);
		actions.contextClick(link).perform();
		Thread.sleep(3000);
		//press 'w' from the keyboard for opening in a new window
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
		
	}
	@Test
	public void moveToElement() throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ac\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("email"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.id("pass"));
		element1.click();
	}
	
	@Test
	public void dragDrop() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ac\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement element1 = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action = new Actions(driver);
		action.clickAndHold(element).perform();
		action.moveToElement(element1).release().perform();
		Thread.sleep(2000);
		driver.close();
		
		}
	@Test
	public void keys() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ac\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.SHIFT).perform();
		Thread.sleep(2000);
		action.sendKeys("qspiders").perform();
		Thread.sleep(2000);
		action.keyUp(Keys.SHIFT).perform();
		Thread.sleep(2000);
		action.doubleClick(search).perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("x").perform();
		Thread.sleep(2000);
		action.keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("V").perform();
		Thread.sleep(2000);
		action.keyUp(Keys.CONTROL).perform();
		
		}
	
	

}
