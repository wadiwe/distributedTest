package com.grid.util.webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.grid.util.misc.thread.ThreadPause;

public class WebDriverWaitForElement
{
	
	public static void waitForElementMultipleTimes(
			WebDriver webDriver,
			WebElement webElement,
			int maxWaitingTimeForLoadingElementPerWaitingSessionInSeconds,
			int maxAmountWaitingSessions,
			int intervalWaitingTimeForCallingAnotherWaitingSessionInSeconds)
	{
		
		int currentAmountWaitingSessions=
				0;
		
		while(
				true)
		{
			
			currentAmountWaitingSessions++;
			
			if(currentAmountWaitingSessions>maxAmountWaitingSessions)
			{
				
				break;
				
			}
			else
			{
				
				try
				{
					
					waitForElementOnce(
				    		webDriver,
				    		webElement,
				    		maxWaitingTimeForLoadingElementPerWaitingSessionInSeconds);
					
				}
				catch(
						Exception exception){
					
					exception.printStackTrace();
					
					ThreadPause.pauseThreadForDurationInSeconds(
							intervalWaitingTimeForCallingAnotherWaitingSessionInSeconds);
					
				}
				
			}
			
		}
		
	}
	
	
	
	static void waitForElementOnce(
			WebDriver webDriver,
			WebElement webElement,
			int maxWaitingTimeForLoadingElementInSeconds)
	{

	    new WebDriverWait(
	    		webDriver,
	    		maxWaitingTimeForLoadingElementInSeconds).until(
	    				ExpectedConditions.visibilityOf(
	    						webElement));
		
	}
	
}
