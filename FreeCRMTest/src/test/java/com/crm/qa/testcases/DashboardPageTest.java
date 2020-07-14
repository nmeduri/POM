package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.basetest.TestBase;
import com.crm.qa.pages.DashboardPage;
import com.crm.qa.pages.LeavePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.Logs;

public class DashboardPageTest extends TestBase{
	DashboardPage dashboard;
	LeavePage applyLeave;
	LoginPage loginpage;
	public DashboardPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		//dashboard =new DashboardPage();
		loginpage=new LoginPage();
		// returns new DashboardPage
		dashboard=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void applyLeaveTest() {
		applyLeave = dashboard.applyLeave();
		Logs.info("Apply Leave button cliked on Dashboard Page...");
	}
	
}
