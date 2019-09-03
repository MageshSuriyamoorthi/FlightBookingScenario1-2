package com.HappyEsayGo.TestScript;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.HappyEsayGo.Util.Click;
import com.HappyEsayGo.Util.Util;
import com.selenium.java.ReadPropFile;
import com.selenium.java.ReadingXlsxFile;

public class HEGHSite1 extends Util {

	ReadPropFile prop = new ReadPropFile();
	ReadingXlsxFile rxlxs = new ReadingXlsxFile();

	@Test(dataProvider="xlxsvalReturn",priority = 1)
	void Url() throws Exception {
		// String[] value = null;

		driver.get("https://www.happyeasygo.com/");

		driver.manage().window().maximize();

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.button.clickflight"));

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.rbutton.roundtrip"));

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.rbutton.oneway"));

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.rbutton.roundtrip"));

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.textbox.from"));

		Click.SendkeysOnElement(driver, prop.readPropertiesFile("locators.textbox.from"), 1);
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.readPropertiesFile("locators.textbox.from"))).sendKeys(Keys.ENTER);

		Click.SendkeysOnElement(driver, prop.readPropertiesFile("locators.textbox.to"), 2);

		driver.findElement(By.xpath(prop.readPropertiesFile("locators.textbox.to"))).sendKeys(Keys.ENTER);

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.searchflight.button"));
	}
}

// driver.findElement(By.xpath(prop.readPropertiesFile("locators.textbox.to"))).sendKeys(Keys.TAB);

/*
 * Click.ClickOnElement(driver,
 * prop.readPropertiesFile("locators.pass.button"));
 * 
 * Click.ClickOnElement(driver,
 * prop.readPropertiesFile("locators.pass.adults"));
 * 
 * Click.ClickOnElement(driver,
 * prop.readPropertiesFile("locators.pass.children"));
 * 
 * Click.ClickOnElement(driver,
 * prop.readPropertiesFile("locators.pass.infant"));
 * 
 * Click.clickOnElementById(driver,
 * prop.readPropertiesFile("locators.radio.premium"));
 * 
 * Click.clickOnElementById(driver,
 * prop.readPropertiesFile("locators.confirm.button"));
 * 
 * Click.ClickOnElement(driver,
 * prop.readPropertiesFile("locators.select.ddate"));
 * 
 * Click.ClickOnElement(driver,
 * prop.readPropertiesFile("locators.select.exactdddate"));
 * 
 * Click.ClickOnElement(driver,
 * prop.readPropertiesFile("locators.select.rdate"));
 * 
 * Click.ClickOnElement(driver,
 * prop.readPropertiesFile("locators.select.exactrdate"));
 */
