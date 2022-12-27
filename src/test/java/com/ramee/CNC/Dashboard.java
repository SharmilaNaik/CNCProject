package com.ramee.CNC;

import org.openqa.selenium.By;

public class Dashboard extends Configuration {

	private void login() {
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();

	}
}
