package com.ramee.CNC;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePage extends Configuration{
	@Test(priority=1,dataProvider="LoginData")
	public void login(String name, String pass) {
		driver.get("https://qa-cnc.rameesystems.com/");
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
	}
	@DataProvider(name="LoginData")
	public Object [][]	LoginData(){
		Object [][] obj= {{"manager","12345678"}};
		return obj;
	}
	 @Test(priority=2)
	public void homeFaceBook() throws InterruptedException {
		driver.get("https://qa-cnc.rameesystems.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='http://facebook.com/']")).click();
		Thread.sleep(3000);
		 String winHandleBefore = driver.getWindowHandle();
		 Thread.sleep(3000);
		 for(String winHandle : driver.getWindowHandles()){
		     driver.switchTo().window(winHandle);
		 }

	}
	 @Test(priority=3)
	 public void homeTwitter() throws InterruptedException {
		 driver.get("https://qa-cnc.rameesystems.com/");
			driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@href='http://twitter.com/']")).click();
			Thread.sleep(3000);
			 String winHandleBefore = driver.getWindowHandle();
			 Thread.sleep(3000);
			 for(String winHandle : driver.getWindowHandles()){
			     driver.switchTo().window(winHandle);
			 }

	}
	@Test(priority=4)
	 public void productDetails() throws InterruptedException {
		 driver.get("https://qa-cnc.rameesystems.com/");
			driver.findElement(By.xpath("//a[contains(text(),'Products Details')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'In Stock')]")).click();
			//driver.findElement(By.xpath("(//div[@class='checkbox'])[2]/label/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),' Featured')]")).click();
			Thread.sleep(3000);
			String expectedMsg="We are sorry but there is no product found to display, please try to search/filter again.";
			String actualMsg=driver.findElement(By.xpath("//h4[@class='margin-bottom-no']")).getText();
			if(actualMsg.equalsIgnoreCase(expectedMsg)) {
				System.out.println("Pass");
			}else {
				System.out.println("Fail");
			}
			
	}
	
	
	 @Test(priority=5)
	 public void colourChange() throws InterruptedException {
		 driver.get("https://qa-cnc.rameesystems.com/");
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("//a[@href=\"https://qa-cnc.rameesystems.com/main/cookie/accepted\"]")).click();
		 driver.findElement(By.xpath("//a[@class=\"theme-color text-orange\"]"))
		 .click();
		 /*Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@data-color=\"blue-grey\"]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@data-color=\"brown\"]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@data-color=\"cyan\"]")).click();*/
	}
}

