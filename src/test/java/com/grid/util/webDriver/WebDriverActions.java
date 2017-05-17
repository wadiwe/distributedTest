package com.grid.util.webDriver;

import org.openqa.selenium.WebElement;

class WebDriverActions
{
	
	static void clear(
			WebElement webElement)
	{
		
		if(webElement!=null)
		{
			
			webElement.clear();
			
		}
		
	}
	
	static void sendKeys(
			WebElement webElement,
			String keysToSend)
	{
		
		if(webElement!=null)
		{
			
			webElement.sendKeys(
					keysToSend);
			
		}
		
	}
	
	
	
	static void click(
			WebElement webElement)
	{
		
		if(webElement!=null)
		{
		    
			webElement.click();
			
		}
		
	}
	
}
