package com.grid.factories;

class FirefoxV45WebDriverManager

extends WebDriverManager
{
	
	private final static String _versionXX=
			"45";
	
	private FirefoxWebDriverManager _FirefoxWebDriverManager;
	
	
	
	public FirefoxV45WebDriverManager()
	{
		
		_FirefoxWebDriverManager=
				new FirefoxWebDriverManager();
		
	}
	
	
	
	@Override
	protected void getDesiredCapabilitiesInstance()
	{
		
		_DesiredCapabilities=
				_FirefoxWebDriverManager.getDesiredCapabilitiesInstanceForVersionXX(
						_versionXX);
		
	}
	
}
