
package com.karatas.command.demo01;

public class Receiver
{
	public void performUndo ( )
	{
		System.out.println( "Executing -MyUndoCommand" );
	}

	public void performRedo ( )
	{
		System.out.println( "Executing -MyRedoCommand" );
	}
}
