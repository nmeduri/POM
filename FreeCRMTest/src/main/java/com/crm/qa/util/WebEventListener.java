package com.crm.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebEventListener implements WebDriverEventListener {

	@Override
	public void afterAlertAccept(WebDriver driver) {
		//System.out.println("After alert accept" + driver.getTitle());
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		//System.out.println("After alert dismiss" + driver.getTitle());
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] c) {
		//System.out.println("Element value changed to" + element.toString());
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		//System.out.println("Clicked on:  " + element.toString());
	}

	@Override
	public void afterFindBy(By by, WebElement arg1, WebDriver arg2) {
		//System.out.println("Element find By: " + by.toString());

	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {

	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String s) {
		//System.out.println("Navigating forward to Next page");

	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		//System.out.println("Navigate back to previous page");
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		//System.out.println("Navigate back to Next page");
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		//System.out.println("After Refresh...");
	}

	@Override
	public void afterNavigateTo(String s, WebDriver driver) {
		//System.out.println("After Navigate to page");
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {

	}

	@Override
	public void afterSwitchToWindow(String s, WebDriver driver) {
		//System.out.println("After switch to Window...");
	}

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		//System.out.println("Before alert accept" + driver.getTitle());
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		//System.out.println("Before alert dismiss" + driver.getTitle());
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] c) {
		//System.out.println("Before change value" + driver.getTitle() + element.toString());
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		//System.out.println("Navigating forward to Next page");

	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		//System.out.println("Trying to find element By :" + by.toString());

	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {

	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		//System.out.println("Before get text element is:");
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		//System.out.println("Navigating backward to Next page");
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		//System.out.println("Navigating forward to Next page");
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
	//	System.out.println("before page get refresh..");
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {

	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {

	}

	@Override
	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {

	}

	@Override
	public void onException(Throwable error, WebDriver driver) {
       TestUtil.takeScreenshotAtFailure();
	}

}
