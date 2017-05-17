package com.grid.testData;

import org.testng.annotations.DataProvider;

public class TestData
{
	
	private static String firefoxV45=
			"firefoxV45";
	
	private static String firefoxV52=
			"firefoxV52";
	
	private static String chrome=
			"chrome";
	
	private static String ie=
			"ie";
	
	
	
	private static String monday=
			"monday";
	
	private static String tuesday=
			"tuesday";
	
	
	
	private static Object _Data[][];
	
	
	
    @DataProvider(
    		name=
    			"testData",
    		parallel=
    			true)
    public static Object[][] createTestData()
    {
    	
    	_Data=
    			new Object[8][2];
		
		
		
		_Data[0][0]=
				chrome;
		
		_Data[0][1]=
				monday;
		
		
		
		_Data[1][0]=
				chrome;
		
		_Data[1][1]=
				tuesday;
		
		
		
		_Data[2][0]=
				ie;
		
		_Data[2][1]=
				monday;
		
		
		
		_Data[3][0]=
				ie;
		
		_Data[3][1]=
				tuesday;
		
		
		
		_Data[4][0]=
				firefoxV45;
		
		_Data[4][1]=
				monday;
		
		
		
		_Data[5][0]=
				firefoxV45;
		
		_Data[5][1]=
				tuesday;
    	
    	
    	
		_Data[6][0]=
				firefoxV52;
		
		_Data[6][1]=
				monday;
		
		
		
		_Data[7][0]=
				firefoxV52;
		
		_Data[7][1]=
				tuesday;
		
		
		
    	return _Data;
				
	}
	
}
