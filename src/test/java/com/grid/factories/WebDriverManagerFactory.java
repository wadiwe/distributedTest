package com.grid.factories;

public class WebDriverManagerFactory
{
	
	private WebDriverManager _WebDriverManager;
	
	
	
	public WebDriverManager createWebDriverManager(
			String browserName)
	{
		
    	_WebDriverManager=
				null;
    	
    	
    	
    	if(browserName!=null)
    	{
        	
    		if(browserName.equalsIgnoreCase(
    				"firefoxV45"))
    		{
    			
    			_WebDriverManager=
    					new FirefoxV45WebDriverManager();
    			
    		}
    		else if(browserName.equalsIgnoreCase(
    				"firefoxV52"))
    		{
    			
    			_WebDriverManager=
    					new FirefoxV52WebDriverManager();
    			
    		}
    		else if(browserName.equalsIgnoreCase(
    				"chrome"))
    		{
    			
    			_WebDriverManager=
    					new ChromeWebDriverManager();
    			
    		}
    		else if(browserName.equalsIgnoreCase(
    				"ie"))
    		{
    			
    			_WebDriverManager=
    					new IEWebDriverManager();
    			
    		}
    		
    	}
		
		
		
		return _WebDriverManager;
		
	}
	
}
