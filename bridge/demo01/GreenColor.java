
package com.karatas.bridge.demo01;

public class GreenColor implements IColor
{
	@Override
	public void fillWithColor ( int border )
	{
		System.out.print( "Green color with " + border + " inch border." );
	}
}
