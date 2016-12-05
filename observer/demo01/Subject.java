
package com.karatas.observer.demo01;

import java.util.ArrayList;
import java.util.List;


public class Subject implements ISubject
{
	List <Observer> observerList = new ArrayList<>();
	private int flag;

	@Override
	public void register ( Observer o )
	{
		observerList.add( o );
	}

	@Override
	public void unregister ( Observer o )
	{
		observerList.remove( 0 );
	}

	@Override
	public void notifyObservers ( )
	{
		for ( Observer observer : observerList )
		{
			observer.update();
		}
	}

	public int getFlag ( )
	{
		return flag;
	}

	public void setFlag ( int flag )
	{
		this.flag = flag;
		notifyObservers();
	}

}
