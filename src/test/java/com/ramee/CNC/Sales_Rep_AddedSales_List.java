package com.ramee.CNC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class Sales_Rep_AddedSales_List  extends Configuration {
	
	@Test(priority=1)
	
	private void addedSaleList() throws InterruptedException {
	
	driver.get("https://qa-cnc.rameesystems.com/");
	FluentWait wait = new FluentWait(driver);
	driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
	driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("sales_rep");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
	wait.pollingEvery(Duration.ofMillis(500));
	wait.withTimeout(Duration.ofSeconds(60));
	driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//span[text()=' Added Sale List']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//div/ins[@class='iCheck-helper'])[3]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@href=\"https://qa-cnc.rameesystems.com/admin/sales/view/1\"]")).click();
	Thread.sleep(5000);
	
	
	}

}
