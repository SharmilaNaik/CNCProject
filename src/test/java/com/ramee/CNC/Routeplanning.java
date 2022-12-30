package com.ramee.CNC;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Routeplanning extends Configuration{
	@Test
	private void routeplan() throws InterruptedException {
	driver.get("https://qa-cnc.rameesystems.com/");
	driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
	driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("manager");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
	driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(text(),' Dispatch & Deliveries ')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Route Planing')]")).click();
	driver.findElement(By.xpath("//ul[@class='select2-choices']")).sendKeys("JR2");
	driver.findElement(By.xpath("//span[contains(text(),'Select Name')]")).sendKeys("MH12Bf1234");
	driver.findElement(By.xpath("//span[contains(text(),'Test Driver 2')]"));
	}
}
