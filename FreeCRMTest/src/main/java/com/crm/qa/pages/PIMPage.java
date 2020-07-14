package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.basetest.TestBase;

public class PIMPage extends TestBase{

	@FindBy (id="firstName")
	WebElement firstname;
	
	@FindBy (id="middleName")
	WebElement middlename;
	
	@FindBy (id="lastName")
	WebElement lastname;
	
	@FindBy (id="btnSave")
	WebElement save;
	
	public PIMPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public void moveToPIM() {
		WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
		Actions action = new Actions(driver);
		action.moveToElement(pim).build().perform();
		WebElement addemployee = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
		action.moveToElement(addemployee).click().build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public PersonalDetailsPage addEmployees(String fName,String mName,String lName) {
		WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
		Actions action = new Actions(driver);
		action.moveToElement(pim).build().perform();
		WebElement addemployee = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
		action.moveToElement(addemployee).click().build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    firstname.sendKeys(fName);
		middlename.sendKeys(mName);
		lastname.sendKeys(lName);
		save.click();		
		return new PersonalDetailsPage();
	}
}
