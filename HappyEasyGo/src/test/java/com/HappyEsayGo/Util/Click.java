package com.HappyEsayGo.Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.java.ReadingXlsxFile;

public class Click {
	public static WebElement element;

	public static void clickOnElementById(WebDriver driver, String Id) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id(Id)).click();

	}

	public static void ClickOnElement(WebDriver driver, String xpath) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.xpath(xpath));
		// driver.findElement(By.xpath(xpath)).click();
		element.click();
	}

	public static void SendkeysOnElement(WebDriver driver, String xpath,int number) throws Exception {
		ReadingXlsxFile xlsx = new ReadingXlsxFile();
		//int i = 1;
	 String value[]=xlsx.xlxsvalReturn();
	//	System.out.println(value.toString());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(xpath)).sendKeys(value[number]);
	
		//System.out.println(val[i]);
		
	}

	/*
	 * public static void SendkeysOnElement(WebDriver driver, String
	 * readPropertiesFile, String value) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
}

/*
 * //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) .withTimeout(30,
 * TimeUnit.SECONDS) .pollingEvery(5, TimeUnit.SECONDS)
 * .ignoring(NoSuchElementException.class); WebElement clickseleniumlink =
 * wait.until(new Function<WebDriver, WebElement>(){
 * 
 * public WebElement apply(WebDriver driver ) { return
 * driver.findElement(By.xpath(xpath)); } }); clickseleniumlink.click();
 */