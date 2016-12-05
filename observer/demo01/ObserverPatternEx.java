
package com.karatas.observer.demo01;

public class ObserverPatternEx
{
	public static void main ( String[] args )
	{
		System.out.println( "*-*-*-*-*ObserverPatternDemo*-*-*-*-*" );

		Observer o1 = new Observer();
		Subject sub1 = new Subject();

		sub1.register( o1 );
		setAndPrintFlag( sub1, 5 );
		setAndPrintFlag( sub1, 25 );
		sub1.unregister( o1 );
		setAndPrintFlag( sub1, 50 );

	}

	private static void setAndPrintFlag ( Subject sub1, int flag )
	{
		System.out.println( ">>>setting flag = " + flag + " " );
		sub1.setFlag( flag );
	}
}