package com.cyient.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

	@DataProvider
	public Object[][] validCredentialData() {
		Object[][] obj = new Object[3][4];
		obj[0][0] = "admin";
		obj[0][1] = "pass";
		obj[0][2] = "English (Indian)";
		obj[0][3] = "OpenEMR";

		obj[1][0] = "physician";
		obj[1][1] = "physician";
		obj[1][2] = "English (Indian)";
		obj[1][3] = "OpenEMR";

		obj[2][0] = "accountant";
		obj[2][1] = "accountant";
		obj[2][2] = "English (Indian)";
		obj[2][3] = "OpenEMR";

		return obj;

	}

	@DataProvider
	public Object[][] inValidCredentialData() {
		Object[][] obj1 = new Object[2][4];
		obj1[0][0] = "john";
		obj1[0][1] = "john123";
		obj1[0][2] = "Dutch";
		obj1[0][3] = "Invalid username or password";

		obj1[1][0] = "peter";
		obj1[1][1] = "peter123";
		obj1[1][2] = "Dutch";
		obj1[1][3] = "Invalid username or password";

		return obj1;

	}
}
