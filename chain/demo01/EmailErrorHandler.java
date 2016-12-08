
package com.karatas.chain.demo01;

public class EmailErrorHandler implements IReceiver
{
	private IReceiver nextReceiver;

	public EmailErrorHandler(IReceiver nextReceiver)
	{
		this.nextReceiver = nextReceiver;
	}

	@Override
	public Boolean processMessage ( Message msg )
	{
		if ( msg.text.contains( "Email" ) )
		{
			System.out.println( "EmailErrorHandler processed " + msg.messagePriority + "priority issue: " + msg.text );
			return true;
		}
		else
		{
			if ( nextReceiver != null )
				nextReceiver.processMessage( msg );
		}
		return false;
	}
}
