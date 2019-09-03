package com.HappyEsayGo.TestScript;

import java.io.FileNotFoundException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.HappyEsayGo.Util.Click;


public class HEGHSite2 extends HEGHSite1 {
	Actions action = new Actions(driver);

	@Test(priority = 2)

	public void Stopcheckbox() throws InterruptedException, FileNotFoundException {
		Thread.sleep(5000);
		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.depart.date"));
		Thread.sleep(3000);
		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.depart.search"));
		Thread.sleep(3000);
		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.return.date"));
		Thread.sleep(3000);
		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.return.search"));

		for (int i = 0; i <= 5; i++) {

			action.sendKeys(Keys.ARROW_DOWN).click().perform();
		}
		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.popup.close"));

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.search.button"));
		Thread.sleep(3000);
		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.book.flight"));

	}
}

/*
 * @Test(priority = 3) public void DepautureCbhome() throws InterruptedException
 * {
 * 
 * Click.ClickOnElement(driver, "(//span[@class='mark-bg mark1'])[1]"); }
 * 
 * @Test(priority = 4) public void DepautureCbDest() throws InterruptedException
 * {
 * 
 * Click.ClickOnElement(driver, "(//span[@class='mark-bg mark1'])[2]"); }
 */