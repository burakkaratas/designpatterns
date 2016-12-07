
package com.karatas.abstractfactory.demo01;

public class ActionMovieFactory implements IMovieFactory
{
	public ITollywoodMovie getTollywoodMovie ( )
	{
		return new TollywoodActionMovie();
	}

	public IBollywoodMovie getBollywoodMovie ( )
	{
		return new BollywoodActionMovie();
	}

}
