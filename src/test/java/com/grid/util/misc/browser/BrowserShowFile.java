package com.grid.util.misc.browser;

import java.awt.Desktop;
import java.net.URI;

import com.grid.util.misc.uri.URIRetrieve;

public class BrowserShowFile
{

	public static Desktop showFileInBrowser(
			String relativePathString)
	{
		
		Desktop desktop=
				null;
		
		
		
		try
		{
			
			URI uri=
					URIRetrieve.retrieveFileURIForWorkingDirectoryFromRelativePathStringOfFile(
							relativePathString);
			
			desktop=
					Desktop.isDesktopSupported()?
							Desktop.getDesktop():
							null;
			
			desktop.browse(
					uri);
			
		}
		catch(
				Exception exception)
		{
			
			exception.printStackTrace();
			
		}
		
		
		
		return desktop;

	}

}
