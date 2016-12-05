
package com.karatas.command.demo01;

public class MyUndoCommand implements ICommand
{
	private Receiver receiver;

	public MyUndoCommand(Receiver rec)
	{
		receiver = rec;
	}

	@Override
	public void Do ( )
	{
		receiver.performRedo();
	}
}
