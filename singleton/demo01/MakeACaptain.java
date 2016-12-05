
package com.karatas.singleton.demo01;

public class MakeACaptain
{
	private static MakeACaptain captain;

	private MakeACaptain()
	{
	}

	public static MakeACaptain getCaptain ( )
	{
		if ( null == captain )
		{
			captain = new MakeACaptain();
			System.out.println( "new Captain selected for out team." );
		}
		else
		{
			System.out.println( "you already have a Captain for your team." );
		}
		return captain;
	}
}
