package com.ramee.CNC;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePage extends Configuration{
	@Test(priority=1,dataProvider="LoginData")
	public void login(String name, String pass) {
		
	}
	@DataProvider(name="LoginData")
	public Object [][]	LoginData(){
		Object [][] obj= {{"manager","12345678"}};
		return obj;
	}

}
