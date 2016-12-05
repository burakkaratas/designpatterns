
package com.karatas.observer.demo02;

import java.util.ArrayList;
import java.util.List;


public class Subject implements ISubject
{
	private int myValue;
	List <IObserver> observersList = new ArrayList <>();

	@Override
	public void notifyObservers ( int flag )
	{
		for ( IObserver iObserver : observersList )
		{
			iObserver.update( myValue );
		}
	}

	@Override
	public void register ( IObserver o )
	{
		observersList.add( o );
	}

	@Override
	public void unregister ( IObserver o )
	{
		observersList.remove( o );
	}

	public int getMyValue ( )
	{
		return myValue;
	}

	public void setMyValue ( int myValue )
	{
		this.myValue = myValue;
		notifyObservers( myValue );
	}
}
