package com.grid.util.webDriver;

import org.openqa.selenium.WebDriver;

public class WebDriverNavigate
{
	
	public static void navigateToURL(
			WebDriver webDriver,
			String url)
	{
		
		if(webDriver!=null)
		{
			
			webDriver.get(
					url);
			
		}
		
	}
	
}
