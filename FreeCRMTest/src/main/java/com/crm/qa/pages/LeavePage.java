package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.basetest.TestBase;

public class LeavePage extends TestBase{
	
	@FindBy(id="assignBtn")
	WebElement assignbutton;
	
	@FindBy(xpath="//a[text()='Leave List']")
	WebElement leavelist;
	
	public LeavePage() {
		PageFactory.initElements(driver,this);
	}
	
	
	// Actions
   public boolean assignButton() {
	   return assignbutton.isDisplayed();
   }
   
   public void leaveList() {
	   leavelist.click();
   }

}
