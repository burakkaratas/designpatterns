
package com.karatas.observer.demo02;

public class Observer1 implements IObserver
{
	@Override
	public void update ( int flag )
	{
		System.out.println( "Observer1: myValue in Subject is now: " + flag );
	}
}
