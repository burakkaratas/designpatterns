
package com.karatas.observer.demo03;

import java.util.ArrayList;
import java.util.List;


public class Subject2 implements ISubject
{

	private int myValue;
	List <IObserver> observerList = new ArrayList<>();

	@Override
	public void register ( IObserver o )
	{
		observerList.add( o );
	}

	@Override
	public void unregister ( IObserver o )
	{
		observerList.remove( 0 );
	}

	@Override
	public void notifyObservers ( int i )
	{
		observerList.forEach( ol -> ol.update( this.getClass().getSimpleName(), i ) );
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
