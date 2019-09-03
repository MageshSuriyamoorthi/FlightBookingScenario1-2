package com.HappyEsayGo.TestScript;

import org.testng.annotations.Test;

import com.HappyEsayGo.Util.Click;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HEGHSite3 extends HEGHSite2 {

	@Test(priority = 3)

	void GoDown() throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Element = driver.findElement(By.xpath(prop.readPropertiesFile("locators.select.dropdown")));

		// This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);

		for (int i = 0; i <= 5; i++) {

			action.sendKeys(Keys.ARROW_UP).click().perform();
		}

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.select.dropdown"));

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.gender.male"));

		Click.SendkeysOnElement(driver, prop.readPropertiesFile("locators.text.name"), 3);

		Click.SendkeysOnElement(driver, prop.readPropertiesFile("locators.text.lname"), 4);
		Click.SendkeysOnElement(driver, prop.readPropertiesFile("locators.text.contactno"), 8);

		Click.SendkeysOnElement(driver, prop.readPropertiesFile("locators.email.id"), 9);

		Click.SendkeysOnElement(driver, prop.readPropertiesFile("locators.phone.no"), 10);

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.gst.details"));

	}

}
