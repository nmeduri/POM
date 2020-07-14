package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.basetest.TestBase;

public class DashboardPage extends TestBase {
	
	@FindBy(css="img[src$='/images/ApplyLeave.png']")
	WebElement applyleave;
	
	
	public DashboardPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public LeavePage applyLeave() {
		applyleave.click();
		return new LeavePage();
	}

}
