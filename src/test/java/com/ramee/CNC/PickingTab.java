package com.ramee.CNC;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PickingTab extends Configuration {
	// @Test(priority=1,dataProvider="LoginData")
	public void login(String name, String pass) {
		driver.get("https://qa-cnc.rameesystems.com/");
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@data-fv-field=\"identity\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-success']")).click();
		driver.findElement(By.xpath("//span[text()=' Picking                 ']")).click();
	}

	@DataProvider(name = "LoginData")
	public Object[][] LoginData() {
		Object[][] obj = { { "manager", "12345678" } };
		return obj;
	}

	@Test(priority = 2)
	public void pickingList() throws InterruptedException {

		driver.findElement(By.xpath("//span[text()=' Picking                 ']")).click();
		driver.findElement(By.xpath("//span[text()=' Picking List']")).click();
		driver.findElement(By.xpath("//input[@name='start_date']")).sendKeys("1-5-2022");
		driver.findElement(By.xpath("//input[@name='end_date']")).sendKeys("29-12-2022");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//driver.findElement(By.xpath("(//div[@class=\"select2-result-label\"])[2]")).click();
	//Thread.sleep(4000);
		// driver.findElement(By.xpath("//i[@data-original-title='Actions']")).click();
		//driver.findElement(By.xpath("(//a[@class=\"select2-choice\"])[2]")).click();

	}

	@Test
	public void pickingList2() {
		driver.findElement(By.xpath("//span[text()=' Picking                 ']")).click();
		driver.findElement(By.xpath("//span[text()=' Picking List']")).click();

		driver.findElement(By.xpath("(//span[@class='select2-chosen'])[1]")).click();

		driver.findElement(By.xpath("(//div[@class=\"select2-result-label\"])[2]")).click();
		driver.findElement(By.xpath("//div[@id='s2id_autogen2']")).click();

		driver.findElement(By.xpath("(//div[@class='select2-result-label'])[3]")).click();
		driver.findElement(By.xpath("(//input[@class='input-xs'])[3]")).sendKeys("JIGNESH MANDORA");
		//Action Button Click
		driver.findElement(By.xpath("//i[@class='icon fa fa-tasks tip']")).click();
		driver.findElement(By.xpath("//a[@data-action='picking_all']")).click();
		String msg=driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		System.out.println(msg);

	}

}
