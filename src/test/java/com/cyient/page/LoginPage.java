package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	private By usernameLocator = By.id("authUser");
	private By passwordLocator = By.id("clearPass");
	private By languageLocator = By.name("languageChoice");
	private By loginLocator = By.xpath("//button[@type='submit']");
	private By errorLocator = By.xpath("//div[contains(text(),'Invalid')]");
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void sendUsername(String username) {

		driver.findElement(usernameLocator).sendKeys(username);
	}

	public void sendPassword(String password) {

		driver.findElement(passwordLocator).sendKeys(password);
	}
	
	public void setLanguageByText(String languageText) {
		Select selectLanguage = new Select(driver.findElement(languageLocator));
		selectLanguage.selectByVisibleText(languageText);
	}
	
	public void clickOnLogin() {
		driver.findElement(loginLocator).click();
	}
	
	public String getErrorMessage() {
		return driver.findElement(errorLocator).getText().trim();
		
	}
}
