package com.ramee.CNC;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeliveryList extends Configuration {
	@Test
	public void login() {
		driver.get("https://qa-cnc.rameesystems.com/");
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
	}

	@Test
	private void OpenDeliveryListAndPrint() throws InterruptedException {
		driver.get("https://qa-cnc.rameesystems.com/");
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),' Dispatch & Deliveries ')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Deliveries List')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='table-responsive']"));
		String table = driver.findElement(By.xpath("//div[@class='table-responsive']")).getText();
		System.out.println(table);

	}

	@Test
	private void searchTableByDateAndPrint() throws InterruptedException {
		driver.get("https://qa-cnc.rameesystems.com/");
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),' Dispatch & Deliveries ')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Deliveries List')]")).click();
		driver.findElement(By.xpath("//input[@aria-controls='myTable']")).sendKeys("30-08-2022");
		driver.findElement(By.xpath("//div[@class='dataTables_wrapper form-inline']"));
		String table = driver.findElement(By.xpath("//div[@class='dataTables_wrapper form-inline']")).getText();
		System.out.println(table);

	}

	@Test
	private void showAll() throws InterruptedException {
		driver.get("https://qa-cnc.rameesystems.com/");
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),' Dispatch & Deliveries ')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Deliveries List')]")).click();
		driver.findElement(By.xpath("//b[@role=\"presentation\"]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[contains(text(),'50')]")).click();

		driver.findElement(By.xpath("//li[@class=\"select2-results-dept-0 select2-result select2-result-selectable\"][2]")).click();
		//Thread.sleep(5000);

		//driver.findElement(By.xpath("//li[@class=\\\"select2-results-dept-0 select2-result select2-result-selectable\\\"][3]")).click();

		//driver.findElement(By.xpath("//div[@id=\"select2-result-label-58\"]")).click();

	}

}
