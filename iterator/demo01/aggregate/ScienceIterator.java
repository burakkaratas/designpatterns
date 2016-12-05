
package com.karatas.iterator.demo01.aggregate;

import java.util.LinkedList;

import com.karatas.iterator.demo01.iterator.IIterator;


public class ScienceIterator implements IIterator
{

	private LinkedList <String> subjects;
	private int position;

	public ScienceIterator(LinkedList <String> subjects)
	{
		this.subjects = subjects;
		position = 0;
	}

	@Override
	public void first ( )
	{
		position = 0;
	}

	@Override
	public String next ( )
	{
		return subjects.get( position++ );
	}

	@Override
	public Boolean isDone ( )
	{
		return position >= subjects.size();
	}

	@Override
	public String currentItem ( )
	{
		return subjects.get( position );
	}

}
