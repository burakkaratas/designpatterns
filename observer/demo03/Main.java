
package com.karatas.observer.demo03;

public class Main
{

	public static void main ( String[] args )
	{
		System.out.println( "*-*-*-*-*-*ObserverPatternDemo3*-*-*-*-*-*" );

		Subject1 sub1 = new Subject1();
		Subject2 sub2 = new Subject2();

		IObserver ob1 = new Observer1();
		IObserver ob2 = new Observer2();
		IObserver ob3 = new Observer3();

		sub1.register( ob1 );
		sub1.register( ob2 );

		sub2.register( ob2 );
		sub2.register( ob3 );

		sub1.setMyValue( 50 );
		System.out.println();
		
		sub2.setMyValue( 250 );
		System.out.println();
		
		sub1.setMyValue( 550 );
		System.out.println();
		
		sub2.setMyValue( 750 );
		System.out.println();
	}
}
