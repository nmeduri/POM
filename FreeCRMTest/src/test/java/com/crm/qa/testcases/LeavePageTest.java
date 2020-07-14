package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.basetest.TestBase;
import com.crm.qa.pages.DashboardPage;
import com.crm.qa.pages.LeavePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.Logs;

public class LeavePageTest extends TestBase {
	LeavePage leavepage;
	LoginPage loginpage;
	DashboardPage dashboard;

	public LeavePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		Logs.startTestCase("LeavePageTest");
		initialization();
		Logs.info("Initialization method loaded successfully...");
		leavepage = new LeavePage();
		loginpage = new LoginPage();
		dashboard = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Logs.info("Credentials data entered on Login page.....");
		dashboard.applyLeave();
		Logs.info("Clicked on ApplyLeave button.....");
	}

	@Test(priority = 1)
	public void assignButtonTest() {
		boolean display = leavepage.assignButton();
		Assert.assertEquals(display, true);
		Logs.info("Assign Button verified.....");
	}

	@Test(priority = 2)
	public void leaveListTest() {
		leavepage.leaveList();
		Logs.info("Leave List Tested.....");
		Logs.endTestCase("LeavePageTest");
	}

}
