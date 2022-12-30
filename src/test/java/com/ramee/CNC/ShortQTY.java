package com.ramee.CNC;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShortQTY extends Configuration {
	@Test
	public void clickOnShortQTY() throws InterruptedException {
	driver.findElement(By.xpath("//span[text()=' Picking                 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='text'])[7]")).click();
		driver.findElement(By.xpath("//div[@class='select2-container select input-xs']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@href=\"javascript:void(0)\"]")).click();
		driver.findElement(By.xpath("(//div[@role='option'])[4]")).click();
		driver.findElement(By.xpath("(//input[@class='input-xs'])[2]")).click();
		String msg=driver.findElement(By.xpath("//td[text()='No data available in table']")).getText();
		System.out.println(msg);
		
	}

}
