package com.grid.factories;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.grid.util.misc.url.URLRetrieve;

public abstract class WebDriverManager
{
	
	private String _URLOfGridHubAsString;
	private String _OSPlatformName;

	private URL _URLOfGridHub;
	protected DesiredCapabilities _DesiredCapabilities;
	private WebDriver _WebDriver;
	
	
	
	protected abstract void getDesiredCapabilitiesInstance();
	
	
	
	public WebDriver createWebDriver(
			String urlOfGridHubAsString,
			String osPlatformName)
    {
    	
		_URLOfGridHubAsString=
				urlOfGridHubAsString;
    	
    	_OSPlatformName=
    			osPlatformName;
    	
    	
		
		if(_WebDriver==null)
		{
			
			createWebDriverInstance();
			
		}
		
		
		
		return _WebDriver;
		
	}
	
	
	
	public void quitWebDriver()
	{
		
		if(_WebDriver!=null)
		{

			_WebDriver.quit();
			
			_WebDriver=
					null;
			
		}
		
	}
	
	
	
	private void createWebDriverInstance()
	{
		
		getURLOfGridHub();
		
		getDesiredCapabilities();
		
		instanciateWebDriver();
		
	}
	
	private void getURLOfGridHub()
	{
		
		_URLOfGridHub=
				URLRetrieve.retrieveURLFromURLString(
						_URLOfGridHubAsString);
		
	}
	
	private void getDesiredCapabilities()
	{
		
		_DesiredCapabilities=
				null;
		
		
		
		getDesiredCapabilitiesInstance();
		
		setPlatformInDesiredCapabilities();
		
	}
	
	private void setPlatformInDesiredCapabilities()
	{
		
		if(_OSPlatformName.equalsIgnoreCase(
				"WINDOWS"))
		{
			
			_DesiredCapabilities.setPlatform(
					Platform.WINDOWS);
			
		}
		
	}
	
	private void instanciateWebDriver()
	{
		
		_WebDriver=
				new RemoteWebDriver(
						_URLOfGridHub,
						_DesiredCapabilities);
		
	}
	
}
