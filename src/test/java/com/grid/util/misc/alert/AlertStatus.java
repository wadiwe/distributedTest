package com.grid.util.misc.alert;

import javafx.scene.control.Alert;

class AlertStatus
{
	
	static void closeAlert(
			Alert alert)
	{
		
		if(alert!=null)
		{
			
			alert.close();
			
		}
		
	}
	
}
