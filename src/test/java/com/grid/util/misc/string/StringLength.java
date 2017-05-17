package com.grid.util.misc.string;

public class StringLength
{
	
	public static String deleteFirstXCharactersFromString(
			String string,
			int numberXOfCharactersToDelete)
	{
		
		return string!=null?
				string.substring(
						numberXOfCharactersToDelete):
				null;
		
	}
	
}
