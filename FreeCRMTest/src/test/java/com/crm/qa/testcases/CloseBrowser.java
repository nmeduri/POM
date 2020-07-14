package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.basetest.TestBase;
import com.crm.qa.util.Logs;

public class CloseBrowser extends TestBase{
	@BeforeMethod
	public void beforeClass() {
		Logs.info("Before Class started..");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		Logs.info("Browser closed.....");
	}
}
