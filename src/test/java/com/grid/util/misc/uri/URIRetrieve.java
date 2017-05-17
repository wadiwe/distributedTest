package com.grid.util.misc.uri;

import java.net.URI;
import java.net.URL;

import com.grid.util.misc.url.URLRetrieve;

public class URIRetrieve
{

	public static URI retrieveFileURIForWorkingDirectoryFromRelativePathStringOfFile(
			String relativePathStringOfFile)
	{
		
		return retrieveURIFromURL(
				URLRetrieve.retrieveFileURLForWorkingDirectoryFromRelativePathStringOfFile(
						relativePathStringOfFile));

	}
	
	

	public static URI retrieveURIFromURL(
			URL url)
	{
		
		URI uri=
				null;
		
		
		
		if(url!=null)
		{
			
			try
			{
				uri=
						url.toURI();
				
			}
			catch(
					Exception exception)
			{
				
				exception.printStackTrace();
				
			}
			
		};
		
		
		
		return uri;

	}

}
