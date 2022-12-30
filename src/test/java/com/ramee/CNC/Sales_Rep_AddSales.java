package com.ramee.CNC;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class Sales_Rep_AddSales extends Configuration {
	@Test(priority=1)
	public void addSale_UsingloginSales_Rep() throws InterruptedException {
		

		driver.get("https://qa-cnc.rameesystems.com/");
		FluentWait wait = new FluentWait(driver);
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("sales_rep");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withTimeout(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id=\"s2id_slcustomer\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"s2id_autogen29_search\"]")).sendKeys("jig");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id=\"select2-drop\"]")).click();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@id=\"myNumber_57\"]")).clear();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id=\"myNumber_57\"]")).sendKeys("5");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@id='57']")).click();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//i[@class=\"fa fa-shopping-cart padding-right-md\"])[1]")).click();
	    Thread.sleep(3000);
	   
	    driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//ins[@class=\"iCheck-helper\"])[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class=\"close\"]")).click();
	    Thread.sleep(3000);
	    
		
	}
	@Test(priority=2)
	public void addCart_Clear_Sales_Rep_() throws InterruptedException {
		
		driver.get("https://qa-cnc.rameesystems.com/");
		FluentWait wait = new FluentWait(driver);
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("sales_rep");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withTimeout(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id=\"s2id_slcustomer\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"s2id_autogen29_search\"]")).sendKeys("jig");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id=\"select2-drop\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"myNumber_57\"]")).clear();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id=\"myNumber_57\"]")).sendKeys("5");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@id='57']")).click();
	    Thread.sleep(3000);
	    
	    
	    String msg= driver.findElement(By.xpath("//span[text()='Product added successfully']")).getText();
	    System.out.println(msg);
	    
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//i[@class=\"fa fa-shopping-cart padding-right-md\"])[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button[@class=\"btn btn-default\"])[3]")).click();
	    Thread.sleep(3000);
	    Alert alert=driver.switchTo().alert();
	    String altMsg=alert.getText();
	    System.out.println(altMsg);
	    alert.accept();
	    
	}
	@Test(priority=3)
	public void viewSalesDetails() throws InterruptedException {
		driver.get("https://qa-cnc.rameesystems.com/");
		FluentWait wait = new FluentWait(driver);
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("sales_rep");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withTimeout(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id=\"s2id_slcustomer\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"s2id_autogen29_search\"]")).sendKeys("jig");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id=\"select2-drop\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://qa-cnc.rameesystems.com/admin/sales/customer_histry/2']")).click();
		Thread.sleep(3000);
		String s=driver.findElement(By.xpath("//table[@aria-describedby='myTable_info']")).getText();
		System.out.println(s);
		driver.findElement(By.xpath("(//span[@class='label label-info'])[1]")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
	    String altMsg=alert.getText();
	    System.out.println(altMsg);
	    alert.accept();
	}
	
	@Test(priority=4)
	
	public void view_SalesDetails_UsingOrderID() throws InterruptedException {
		
		driver.get("https://qa-cnc.rameesystems.com/");
		FluentWait wait = new FluentWait(driver);
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("sales_rep");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withTimeout(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id=\"s2id_slcustomer\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"s2id_autogen29_search\"]")).sendKeys("ros");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id=\"select2-drop\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://qa-cnc.rameesystems.com/admin/sales/customer_histry/118']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"https://qa-cnc.rameesystems.com/admin/sales/view/216\"]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-default no-print pull-right\"]")).click();
		//Thread.sleep(3000);
		
		 }
	}

