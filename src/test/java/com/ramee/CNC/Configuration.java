package com.ramee.CNC;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Configuration {
	WebDriver driver = null;
	
	@BeforeMethod
	public void lounchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofSeconds(1));
	}

	@AfterMethod
	public void closeBrowser() {
		//driver.close();

	}

}
