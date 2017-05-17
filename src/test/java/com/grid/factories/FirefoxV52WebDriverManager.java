package com.grid.factories;

class FirefoxV52WebDriverManager

extends WebDriverManager
{
	
	private final static String _versionXX=
			"52";
	
	private FirefoxWebDriverManager _FirefoxWebDriverManager;
	
	
	
	public FirefoxV52WebDriverManager()
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
