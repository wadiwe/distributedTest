package com.grid.util.misc.string;

import org.apache.commons.lang3.StringUtils;

public class StringContent
{
	
	public static boolean isString1ContainedInString2IgnoreCase(
			String string1,
			String string2)
	{
		
		return StringUtils.containsIgnoreCase(
				string2,
				string1);
		
	}
	
}
