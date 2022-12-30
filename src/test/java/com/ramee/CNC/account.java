package com.ramee.CNC;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class account extends Configuration{
	
	@Test
	public void addedPaymentReceipt() throws InterruptedException  {
	
		driver.get("https://qa-cnc.rameesystems.com/");
	    driver.manage().window().maximize();
		WebElement loginDropdown=driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']"));
		loginDropdown.click();
		
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		WebElement loginButton= driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']"));
		loginButton.click();
		Thread.sleep(10000);
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(60));;
		WebElement Account =driver.findElement(By.xpath("//*[@class='nav main-menu']/li[5]/a/span[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(Account));	   
		Account.click();
		Thread.sleep(2000);
		
		WebElement paymentReceipt =driver.findElement(By.xpath("//li[@id='payments_receipt']"));
		paymentReceipt.click();
		
		WebElement selectCustomer =driver.findElement(By.xpath("//span[@id='select2-chosen-1']"));
		selectCustomer.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='s2id_autogen1_search']")).sendKeys("sal");
		Thread.sleep(2000);
		
		
		WebElement customer=driver.findElement(By.xpath("//*[@id='select2-results-1']/li[5]"));
		//customer.sendKeys("TESTON STORE (70214)");
		customer.click();
		Thread.sleep(2000);
		
		WebElement amount=driver.findElement(By.xpath("//input[@id='amount_1']"));
		amount.sendKeys("2500");
		
		WebElement reference =driver.findElement(By.xpath("//input[@id='reference_no']"));
		reference.sendKeys("123");
		
		WebElement date =driver.findElement(By.xpath("//input[@id='date']"));
		date.sendKeys("30-12-2022");
		date.click();
		
		driver.findElement(By.xpath("//span[@id='select2-chosen-2']")).click();
		WebElement payingBy =driver.findElement(By.xpath("//input[@id='s2id_autogen2_search']"));
		payingBy.click();
		
		driver.findElement(By.xpath("//input[@id='s2id_autogen2_search']")).click();
	//	Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='select2-results-2']/li[2]")).click();
		WebElement submitbutton =driver.findElement(By.xpath("//button[@id='add_payment']"));
		submitbutton.click();
		Thread.sleep(2000);
			
		
		driver.findElement(By.xpath("//div[@class='swal2-modal swal2-show']/button[@class='swal2-confirm btn btn-success']")).click();
		
	}
}