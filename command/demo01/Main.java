
package com.karatas.command.demo01;

public class Main
{
	public static void main ( String[] args )
	{
		System.out.println( "*-*-*-*CommandPatternDemo*-*-*-*" );
		Receiver intendedreceiver = new Receiver();
		Invoke inv = new Invoke();
		MyUndoCommand unCmd = new MyUndoCommand( intendedreceiver );
		MyRedoCommand reCmd = new MyRedoCommand( intendedreceiver );
		inv.ExecuteCommand( unCmd );
		inv.ExecuteCommand( reCmd );
	}
}
