
package com.karatas.command.demo01;

public class MyRedoCommand implements ICommand
{
	private Receiver receiver;

	public MyRedoCommand(Receiver rec)
	{
		receiver = rec;
	}

	@Override
	public void Do ( )
	{
		receiver.performUndo();
	}
}
