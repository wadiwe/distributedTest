package com.grid.factories;

import org.openqa.selenium.remote.DesiredCapabilities;

class IEWebDriverManager

extends WebDriverManager
{
	
	@Override
	protected void getDesiredCapabilitiesInstance()
	{
		
		_DesiredCapabilities=
				DesiredCapabilities.internetExplorer();
		
	}
	
}
