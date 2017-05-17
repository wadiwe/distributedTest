package com.grid.factories;

import org.openqa.selenium.remote.DesiredCapabilities;

class FirefoxWebDriverManager
{
	
	private DesiredCapabilities _DesiredCapabilities;
	
	
	
	DesiredCapabilities getDesiredCapabilitiesInstanceForVersionXX(
			String versionXX)
	{
		
		_DesiredCapabilities=
				null;
		
		
		
		_DesiredCapabilities=
				DesiredCapabilities.firefox();
		
		_DesiredCapabilities.setVersion(
				versionXX);
		
		
		
		return _DesiredCapabilities;
		
	}
	
}
