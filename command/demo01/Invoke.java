
package com.karatas.command.demo01;

public class Invoke
{
	ICommand cmd;

	public void ExecuteCommand ( ICommand cmd )
	{
		this.cmd = cmd;
		cmd.Do();
	}
}
