
package com.karatas.memento.demo01;

public class Originator
{
	private String state;
	Memento m;

	public void setState ( String state )
	{
		this.state = state;
		System.out.println( "State at present : " + state );
	}

	public Memento originatorMemento ( )
	{
		m = new Memento( state );
		return m;
	}

	public void revert ( Memento memento )
	{
		System.out.println( "Restoring to previous state..." );
		state = memento.getState();
		System.out.println( "State at present :" + state );
	}
}
