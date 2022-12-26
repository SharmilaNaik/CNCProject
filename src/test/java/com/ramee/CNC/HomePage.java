package com.ramee.CNC;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePage extends Configuration{
	@Test(priority=1,dataProvider="LoginData")
	public void login(String name, String pass) {
		driver.get("https://qa-cnc.rameesystems.com/");
		driver.findElement(By.xpath("//button[@id='dropdownLogin']")).click();
		driver.findElement(By.xpath("//input[@id='username2097642415']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='password2097642415']']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@value='login']")).click();
	}
	@DataProvider(name="LoginData")
	public Object [][]	LoginData(){
		Object [][] obj= {{"manager","12345678"}};
		return obj;
	}

}
