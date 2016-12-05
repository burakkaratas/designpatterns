
package com.karatas.iterator.demo01.aggregate;

import java.util.LinkedList;

import com.karatas.iterator.demo01.iterator.IIterator;


public class Science implements ISubject
{
	private LinkedList <String> subjects;

	public Science()
	{
		subjects = new LinkedList<>();
		subjects.addLast( "Maths" );
		subjects.addLast( "Comp. Sc." );
		subjects.addLast( "Physics" );
	}

	@Override
	public IIterator CreateIterator ( )
	{
		return new ScienceIterator(subjects);
	}
}
