
package com.karatas.iterator.demo01.main;

import com.karatas.iterator.demo01.aggregate.Arts;
import com.karatas.iterator.demo01.aggregate.ISubject;
import com.karatas.iterator.demo01.aggregate.Science;
import com.karatas.iterator.demo01.iterator.IIterator;


public class Main
{
	public static void main ( String[] args )
	{
		System.out.println( "***Iterator Pattern Demo***\n" );
		ISubject Sc_subject = new Science();
		ISubject Ar_subjects = new Arts();

		IIterator Sc_iterator = Sc_subject.CreateIterator();
		IIterator Ar_iterator = Ar_subjects.CreateIterator();

		System.out.println( "\nScience subjects :" );
		Print( Sc_iterator );

		System.out.println( "\nArts subjects :" );
		Print( Ar_iterator );
	}

	public static void Print ( IIterator iterator )
	{
		while ( !iterator.isDone() )
		{
			System.out.println( iterator.next() );
		}

	}
}
