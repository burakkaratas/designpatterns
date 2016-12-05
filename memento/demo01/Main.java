
package com.karatas.memento.demo01;

public class Main
{

	public static void main ( String[] args )
	{
		System.out.println( "***Memento Pattern Demo***\n" );
		Originator o = new Originator();
		o.setState( "First state" );

		Caretaker c = new Caretaker();
		c.saveMemento( o.originatorMemento() );

		o.setState( "second state" );

		o.revert( c.retrieveMemento() );
	}

}
