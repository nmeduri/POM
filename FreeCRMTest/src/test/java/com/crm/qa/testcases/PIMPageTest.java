package com.crm.qa.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.basetest.TestBase;
import com.crm.qa.pages.DashboardPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.PIMPage;
import com.crm.qa.pages.PersonalDetailsPage;
import com.crm.qa.util.Logs;
import com.crm.qa.util.TestUtil;

public class PIMPageTest extends TestBase{
	LoginPage loginpage;
	DashboardPage dashboard;
	PIMPage pimpage;
	PersonalDetailsPage addEmployees;
	String sheetname="employee";
	PersonalDetailsPage adddetailspage;
	public PIMPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		Logs.info("Initialization method loaded.....");
        pimpage=new PIMPage();
        loginpage=new LoginPage();
		dashboard = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Logs.info("Credentials entered on Login page.....");
	}
	
//	@Test(priority=1,enabled=true)
//	public void moveToPIMTest() {
//		pimpage.moveToPIM();
//	}
//	
	
	@DataProvider
	public Object[][] getCRMTestData() throws InvalidFormatException {
		Object[][] testData = TestUtil.getTestData(sheetname);
		return testData;		
	}
	
	@Test(priority=1,dataProvider="getCRMTestData")
	public void addEmployeesTest(String fn,String mn, String ln) {
		adddetailspage = pimpage.addEmployees(fn, mn, ln);
		Logs.info("Data  Provided started.....");
	}
	
  
}
