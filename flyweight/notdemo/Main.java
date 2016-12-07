
package com.karatas.flyweight.notdemo;

public class Main
{
	public static void main ( String[] args ) throws Exception
	{
		System.out.println( "\n***PatternExample***\n" );
		RobotFactory myfactory = new RobotFactory();

		IRobot shape = myfactory.getRobotFromFactory( "small" );
		shape.print();

		for ( int i = 0; i < 2; i++ )
		{
			shape = myfactory.getRobotFromFactory( "small" );
			shape.print();
		}
		int NumOfDistinctRobots = myfactory.totalObjectsCreated();
		System.out.println( "\nDistinct Robot objects created till now= " + NumOfDistinctRobots );

		for ( int i = 0; i < 5; i++ )
		{
			shape = myfactory.getRobotFromFactory( "large" );
			shape.print();
		}
		NumOfDistinctRobots = myfactory.totalObjectsCreated();
		System.out.println( "\n Finally no of Distinct Robot objects created: " + NumOfDistinctRobots );

	}
}
