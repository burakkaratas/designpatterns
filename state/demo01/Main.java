
package com.karatas.state.demo01;

public class Main
{
	public static void main ( String[] args )
	{
		System.out.println( "***State Pattern Demo***\n" );
		Off initialState = new Off();
		TV tv = new TV( initialState );
		tv.pressButton();
		tv.pressButton();
	}
}
