package com.grid.util.misc.thread;

public class ThreadPause
{

	public static void pauseThreadForDurationInSeconds(
			int durationInSeconds)
	{
		
		try
		{
			
			Thread.sleep(
					durationInSeconds*1000);
			
		}
		catch(
				Exception exception)
		{
			
			exception.printStackTrace();
			
		}

	}

}
