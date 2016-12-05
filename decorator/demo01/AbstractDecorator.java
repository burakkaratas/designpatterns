
package com.karatas.decorator.demo01;

public class AbstractDecorator extends Component
{
	protected Component com;

	public void setTheComponent ( Component c )
	{
		com = c;
	}

	@Override
	public void doJob ( )
	{
		if ( null != com )
		{
			com.doJob();
		}
	}
}
