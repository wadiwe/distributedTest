package com.grid.util.misc.path;

import java.net.URI;
import java.net.URL;

import com.grid.util.misc.string.StringLength;
import com.grid.util.misc.uri.URIRetrieve;

public class PathRetrieve
{
	
	public static String retrieveAbsolutePathStringFromRelativePathString(
			Object classObjectRelativeToFile,
			String relativePathString)
	{
		
		String editedAbsolutePathString=
				null;
		
		
		
		URL absolutePathURL=
				null;
		
		if(classObjectRelativeToFile!=null)
		{
			
			absolutePathURL=
					classObjectRelativeToFile.getClass().getResource(
							relativePathString);
			
		}
		
		
		
		String originalAbsolutePathString=
				retrievePathStringFromURL(
						absolutePathURL);
		
		
		
		editedAbsolutePathString=
				null;
		
		if(originalAbsolutePathString!=null)
		{
			
			editedAbsolutePathString=
					StringLength.deleteFirstXCharactersFromString(
							originalAbsolutePathString,
							1);
			
		}
		
		
		
		return editedAbsolutePathString;

	}
	
	
	
	private static String retrievePathStringFromURL(
			URL url)
	{
		
		return retrievePathStringFromURI(
				URIRetrieve.retrieveURIFromURL(
						url));

	}
	
	
	
	private static String retrievePathStringFromURI(
			URI uri)
	{
		
		return uri!=null?
				uri.getPath():
				null;

	}

}
