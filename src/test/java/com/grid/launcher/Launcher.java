package com.grid.launcher;

import java.util.List;

import org.testng.TestNG;

import com.beust.jcommander.internal.Lists;
import com.grid.util.misc.alert.InfoAlert;
import com.grid.util.misc.browser.BrowserShowFile;
import com.grid.util.misc.path.PathRetrieve;

import javafx.application.Application;
import javafx.stage.Stage;

/*
 * The Launcher class is a convenience class for carrying out the test by running the project as a Java-Application.
 */

public class Launcher

extends Application
{
	
	public static void main(
			String[] args)
	{
		
		launch(
				args);
		
	}
	
	
	
	@Override public void start(
			Stage stage)
	{
		
		executeProgram();
		
	}
    
    
    
    private void executeProgram()
    {
		
		InfoAlert infoAlert=
				new InfoAlert();
		
		
		
		infoAlert.createAlert(
				"Executing Test...");
		
		
		
		TestNG testNG=
				new TestNG();
		
		List<String> suiteList=
				Lists.newArrayList();
		
		suiteList.add(
				PathRetrieve.retrieveAbsolutePathStringFromRelativePathString(
						this,
						"/int/testng/xml/CountSearchResultsTestCase.xml"));
		
		testNG.setTestSuites(
				suiteList);
		
		testNG.run();
		
		
		
		infoAlert.closeAlert();
		
		
		
		infoAlert.createAlert(
				"Showing Test Results...");
		
		
		
		BrowserShowFile.showFileInBrowser(
				".\\test-output\\emailable-report.html");
		
		
		
		infoAlert.closeAlert();

	}

}
