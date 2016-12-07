
package com.karatas.abstractfactory.demo01;

public class Main
{

	public static void main ( String[] args )
	{
		System.out.println( "***AbstractFactoryPatternDemo***" );
		ActionMovieFactory actionMovies = new ActionMovieFactory();
		ITollywoodMovie tAction = actionMovies.getTollywoodMovie();
		IBollywoodMovie bAction = actionMovies.getBollywoodMovie();

		System.out.println( "\nAction movies  are:" );
		System.out.println( tAction.movieName() );
		System.out.println( bAction.movieName() );

		ComedyMovieFactory comedyMovies = new ComedyMovieFactory();
		ITollywoodMovie tComedy = comedyMovies.getTollywoodMovie();
		IBollywoodMovie bComedy = comedyMovies.getBollywoodMovie();

		System.out.println( "\nComedy movies  are:" );
		System.out.println( tComedy.movieName() );
		System.out.println( bComedy.movieName() );
	}

}
