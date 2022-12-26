package com.ramee.CNC;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\JARs\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://qa-cnc.rameesystems.com/"); 
		//driver.findElement(By.xpath("//a[contains(text(),\"Home\")]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Products Details\")]")).click();
		driver.findElement(By.xpath("//span[contains(text(),\" Featured\")]")).click();
		Thread.sleep(3000);
		String expcetedresulte=("We are sorry but there is no product found to display, please try to search/filter again.");
		String actualresulte=driver.findElement(By.xpath("//h4[@class='margin-bottom-no']")).getText();
		if(expcetedresulte.equals(actualresulte)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		}

}
