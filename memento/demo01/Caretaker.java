
package com.karatas.memento.demo01;

public class Caretaker
{
	private Memento memento;

	public void saveMemento ( Memento m )
	{
		memento = m;
	}

	public Memento retrieveMemento ( )
	{
		return memento;
	}

}
