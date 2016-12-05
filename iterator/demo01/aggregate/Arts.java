
package com.karatas.iterator.demo01.aggregate;

import com.karatas.iterator.demo01.iterator.IIterator;


public class Arts implements ISubject
{
	private String[] subjects;

	public Arts()
	{
		subjects = new String[2];
		subjects[0] = "Turkish";
		subjects[1] = "English";
	}

	@Override
	public IIterator CreateIterator ( )
	{
		return new ArtsIterator( subjects );
	}
}
