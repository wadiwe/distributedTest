package com.grid.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract class PageObject
{
	
	protected WebDriver _WebDriver;
	
	
	
	protected PageObject(
			WebDriver webDriver) {
		
		_WebDriver=
				webDriver;
		
		
		
		PageFactory.initElements(
				_WebDriver,
				this);
		
	}
	
}
