
package com.karatas.observer.demo02;

public class Observer2 implements IObserver
{
	@Override
	public void update ( int flag )
	{
		System.out.println( "Observer2: observes ->myValue is changed in Subject to : " + flag );
	}
}
