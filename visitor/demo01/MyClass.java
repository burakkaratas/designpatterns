
package com.karatas.visitor.demo01;

public class MyClass implements IOriginalInterface
{
	private int myInt = 5;

	@Override
	public void accept ( IVisitor visitor )
	{
		System.out.println( "Initial value of the integer :" + myInt );
		visitor.visit( this );
		System.out.println( "\nValue of the integer now :" + myInt );
	}

	public int getMyInt ( )
	{
		return myInt;
	}

	public void setMyInt ( int myInt )
	{
		this.myInt = myInt;
	}
}
