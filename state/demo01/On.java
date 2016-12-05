
package com.karatas.state.demo01;

public class On extends RemoteControl
{
	public void pressSwitch ( TV context )
	{
		System.out.println( "I am already On .Going to be Off now" );
		context.setState( new Off() );
	}
}
