
package com.karatas.singleton.demo01;

public class Main
{
	public static void main ( String[] args )
	{
		System.out.println( "*-*-*-*-*-SingletonPatternDemo*-*-*-*-*-" );
		MakeACaptain c1 = MakeACaptain.getCaptain();
		System.out.println( "trying to make another captain for our team." );
		MakeACaptain c2 = MakeACaptain.getCaptain();
		if ( c1 == c2 )
		{
			System.out.println( "c1 and c2 are same instance." );
		}
	}

}
