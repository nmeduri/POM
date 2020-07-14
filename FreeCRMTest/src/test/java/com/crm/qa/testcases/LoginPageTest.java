package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.basetest.TestBase;
import com.crm.qa.pages.DashboardPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.Logs;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	DashboardPage dashboard;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		Logs.info("Initialization page Loaded.....");
		loginpage = new LoginPage();
	}

	@Test(priority = 1)
	public void validateLoginPageTitleTest() {
		String validateLoginPageTitle = loginpage.validateLoginPageTitle();
		Assert.assertEquals(validateLoginPageTitle, "OrangeHRM");
		Logs.info("Login page title verified.....");
	}

	@Test(priority = 2)
	public void validateforgotPasswordLinkTest() {
		boolean validateforgotPasswordLink = loginpage.validateforgotPasswordLink();
		Assert.assertEquals(validateforgotPasswordLink, true);
		Logs.info("Forgot password link verified.....");
	}

	@Test(priority = 3)
	public void loginTest() {
		dashboard = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Logs.info("Credentials entered on Login Page.....");
	}

	@Test(priority = 4)
	public void validateImageTest() {
		boolean logo = loginpage.validateImage();
		Assert.assertEquals(logo, true);
		Logs.info("Login Page Image validated.....");
	}
}
