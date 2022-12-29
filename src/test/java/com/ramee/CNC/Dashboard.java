package com.ramee.CNC;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class Dashboard extends Configuration {
	@Test
	public void login() {
		driver.get("https://qa-cnc.rameesystems.com/");
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();

	}

	@Test
	public void styleColourChange() throws InterruptedException {
		driver.get("https://qa-cnc.rameesystems.com/");
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
		Thread.sleep(5000);
			       
		driver.findElement(By.xpath("//a[@data-original-title='Styles']")).click();
		//wait.withTimeout(Duration.ofSeconds(5));
		Thread.sleep(5000);

		driver.findElement(By.xpath("//li/a[@id='cssBlack']")).click();

	}

	@Test
	public void viewCalculator() throws InterruptedException {
		driver.get("https://qa-cnc.rameesystems.com/");
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@data-original-title='Calculator']")).click();

	}

	@Test
	public void logout() throws InterruptedException {
		driver.get("https://qa-cnc.rameesystems.com/");
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[contains(text(),'Welcome manager')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='fa fa-sign-out']")).click();
	}

	@Test
	public void openProfile() throws InterruptedException {
		driver.get("https://qa-cnc.rameesystems.com/");
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Welcome manager')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withTimeout(Duration.ofSeconds(60));

	}
}
