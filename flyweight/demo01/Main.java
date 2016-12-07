
package com.karatas.flyweight.demo01;

import java.util.Random;


public class Main
{

	public static void main ( String[] args ) throws Exception
	{
		System.out.println( "\n***FlyweightPatternExampleModified***\n" );
		RobotFactory myfactory = new RobotFactory();
		Robot shape;

		for ( int i = 0; i < 3; i++ )
		{
			shape = (Robot) myfactory.getRobotFromFactory( "King" );
			shape.setColorOfRobot( getRandomColor() );
			shape.print();
		}

		for ( int i = 0; i < 3; i++ )
		{
			shape = (Robot) myfactory.getRobotFromFactory( "Queen" );
			shape.setColorOfRobot( getRandomColor() );
			shape.print();
		}

		int NumOfDistinctRobots = myfactory.totalObjectsCreated();
		System.out.println( "\n Finally no of Distinct Robot objects created: " + NumOfDistinctRobots );

	}

	static String getRandomColor ( )
	{
		Random r = new Random();
		int random = r.nextInt( 20 );
		if ( random % 2 == 0 )
		{
			return "red";
		}
		else
		{
			return "green";
		}
	}
}
