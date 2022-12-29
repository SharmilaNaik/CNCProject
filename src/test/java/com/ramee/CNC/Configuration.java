package com.ramee.CNC;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Configuration {
	WebDriver driver = null;
	//FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	FluentWait wait = new FluentWait(driver);
	       

	@BeforeMethod
	public void lounchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();

	}

}
