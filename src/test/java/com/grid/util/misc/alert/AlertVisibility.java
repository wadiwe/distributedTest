package com.grid.util.misc.alert;

import javafx.scene.control.Alert;

class AlertVisibility
{
	
	static void makeAlertVisibleNonModal(
			Alert alert)
	{
		
		if(alert!=null)
		{
			
			alert.show();
			
		}
		
	}
	
}
