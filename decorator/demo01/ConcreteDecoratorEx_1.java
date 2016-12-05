
package com.karatas.decorator.demo01;

public class ConcreteDecoratorEx_1 extends AbstractDecorator
{
	public void doJob ( )
	{
		super.doJob();
		System.out.println( "I am explicitly from Ex_1" );
	}
}
