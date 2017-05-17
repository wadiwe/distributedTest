package com.grid.factories;

import org.openqa.selenium.remote.DesiredCapabilities;

class ChromeWebDriverManager

extends WebDriverManager
{
	
	@Override
	protected void getDesiredCapabilitiesInstance()
	{
		
		_DesiredCapabilities=
				DesiredCapabilities.chrome();
		
	}
	
}
