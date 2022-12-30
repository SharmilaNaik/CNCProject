package com.ramee.CNC;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ConfirmPickedOrder extends Configuration {
   @Test
	public void pickedOrder() throws InterruptedException  {
		 driver.findElement(By.xpath("//span[text()=' Picking                 ']")).click();
		 Thread.sleep(4000);
	  driver.findElement(By.xpath("//span[text()=' Confirm Picked Order']")).click();
	  driver.findElement(By.xpath("//input[@name='start_date']")).sendKeys("1-6-2022");
	  driver.findElement(By.xpath("//input[@name='end_date']")).sendKeys("30-12-2022");
	  driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	  driver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
	 
	  driver.findElement(By.xpath("(//div[@role='option'])[3]")).click();
	  //Thread.sleep(4000);
	  driver.findElement(By.xpath("//i[@class='icon fa fa-tasks tip']")).click();
	  driver.findElement(By.xpath("//a[@data-action='picking_all']")).click();
	  String msg=driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
	  System.out.println(msg);
   }
	  
	  public void clickTable() throws InterruptedException{
		  
		  driver.findElement(By.xpath("//span[text()=' Picking                 ']")).click();
			 Thread.sleep(4000);
		  driver.findElement(By.xpath("//span[text()=' Confirm Picked Order']")).click();
	  driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("000153");
	  driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[1]")).click();
	  driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[2]")).click();

	}

}
