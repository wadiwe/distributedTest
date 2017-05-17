package com.grid.util.webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverSafeActions
{
	
	public static void safeClear(
			WebDriver webDriver,
			WebElement webElement,
			int maxWaitingTimeForLoadingElementInSeconds)
	{
		
		WebDriverWaitForElement.waitForElementOnce(
				webDriver,
				webElement,
	    		maxWaitingTimeForLoadingElementInSeconds);
		
		WebDriverActions.clear(
				webElement);
		
	}
	
	public static void safeSendKeys(
			WebDriver webDriver,
			WebElement webElement,
			int maxWaitingTimeForLoadingElementInSeconds,
			String keysToSend)
	{
		
		WebDriverWaitForElement.waitForElementOnce(
				webDriver,
				webElement,
	    		maxWaitingTimeForLoadingElementInSeconds);
		
		WebDriverActions.sendKeys(
				webElement,
				keysToSend);
		
	}
	
	
	
	public static void safeClick(
			WebDriver webDriver,
			WebElement webElement,
			int maxWaitingTimeForLoadingElementInSeconds)
	{
		
		WebDriverWaitForElement.waitForElementOnce(
	    		webDriver,
	    		webElement,
	    		maxWaitingTimeForLoadingElementInSeconds);
	    
		WebDriverActions.click(
				webElement);
		
	}
	
}
