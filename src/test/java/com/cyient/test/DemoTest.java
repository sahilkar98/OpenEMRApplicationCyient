package com.cyient.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTest {

	@DataProvider
	public Object[][] validData(){
		Object[][] main = new Object[3][2];
		main[0][0]="sahil";
		main[0][1]="sahil123";
		
		main[1][0]="john";
		main[1][1]="john123";
		
		main[2][0]="peter";
		main[2][1]="peter123";
		
		return main;
	}
	@Test(dataProvider = "validData")
	public void validTest(String username,String password) {
		System.out.println("Test run"+username+password);
	}
}
