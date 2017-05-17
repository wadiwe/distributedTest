package com.grid.util.misc.alert;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class InfoAlert

{
	
	private Alert _Alert;
	private String _TextToDisplay;
	
	
	
	public void createAlert(
			String textToDisplay)
	{
		
		_TextToDisplay=
				textToDisplay;
		
		
		
		if(_Alert!=null)
		{
			
			closeAlert();
			
		}
		
		
		
		_Alert=
				new Alert(
						AlertType.INFORMATION);
		
		_Alert.setHeaderText(
				null);

		_Alert.setContentText(
				_TextToDisplay);
		
		_Alert.setOnCloseRequest(
				null);

		AlertVisibility.makeAlertVisibleNonModal(
				_Alert);
		
	}
	
	
	
	public void closeAlert()
	{
		
		AlertStatus.closeAlert(
				_Alert);
		
	}

}
