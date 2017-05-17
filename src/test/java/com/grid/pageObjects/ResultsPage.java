package com.grid.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.grid.util.webDriver.WebDriverWaitForElement;

public class ResultsPage

extends PageObject
{

	@FindBy(
			id=
				"resultStats")
	private WebElement _ResultsList;

	@FindBy(
			xpath=
				".//*[@id='rso']//*[@class='rc']//h3/a")
	private List<WebElement> _ResultTitleWebElementsList;
	
	
	
	private int _MaxWaitingTimeForLoadingElementPerWaitingSessionInSeconds=
			1;
	private int _IntervalWaitingTimeForCallingAnotherWaitingSessionInSeconds=
			1;
	private int _MaxAmountWaitingSessions=
			5*60;
	
	private List<String> _ResultTitleTextsList;
	
	
	
	public ResultsPage(
			WebDriver webDriver) {
		
		super(
				webDriver);
		
	}
	
	
	
	public List<String> getResultsList()
	{
		
		_ResultTitleTextsList=
				null;
		
		
		
		//Complex waiting mechanism, being an "all in one place" solution for dealing with the different kinds of runtime exceptions that might possibly be thrown when using different kinds of browsers.
		WebDriverWaitForElement.waitForElementMultipleTimes(
				_WebDriver,
				_ResultsList,
				_MaxWaitingTimeForLoadingElementPerWaitingSessionInSeconds,
				_MaxAmountWaitingSessions,
				_IntervalWaitingTimeForCallingAnotherWaitingSessionInSeconds);
		
		
		
		if(_ResultTitleWebElementsList!=null)
		{
			
			_ResultTitleTextsList=
					new ArrayList<String>();

			for(WebElement currentResultTitleWebElement : _ResultTitleWebElementsList)
			{
				
				_ResultTitleTextsList.add(
						currentResultTitleWebElement.getText());
				
			}
			
		}
		
		
		
		return _ResultTitleTextsList;
		
	}
	
}
