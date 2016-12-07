
package com.karatas.abstractfactory.demo01;

public class ComedyMovieFactory implements IMovieFactory
{
	public ITollywoodMovie getTollywoodMovie ( )
	{
		return new TollywoodComedyMovie();
	}

	public IBollywoodMovie getBollywoodMovie ( )
	{
		return new BollywoodComedyMovie();
	}

}
