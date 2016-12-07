
package com.karatas.abstractfactory.demo01;

public interface IMovieFactory
{
	ITollywoodMovie getTollywoodMovie ( );

	IBollywoodMovie getBollywoodMovie ( );
}
