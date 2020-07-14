package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.basetest.TestBase;

public class LoginPage extends TestBase{
	
	// PageFactory - OR
	
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement passWord;
	
	@FindBy(id="btnLogin")
	WebElement login;
	
	@FindBy(css="img[src$='/themes/default/images/login/logo.png']")
	WebElement crmLogo;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	WebElement forgotPassword;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	// Actions
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
  
	public boolean validateforgotPasswordLink() {
		   boolean displayed = forgotPassword.isDisplayed();
		   return displayed;
	}
	
	public boolean validateImage() {
		boolean logodisplayed = crmLogo.isDisplayed();
		return logodisplayed;
	}
	
	public DashboardPage login(String un,String pwd) {
		userName.sendKeys(un);
		passWord.sendKeys(pwd);
		login.click();
		return  new DashboardPage();
	}
}
