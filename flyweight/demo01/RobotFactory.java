
package com.karatas.flyweight.demo01;

import java.util.HashMap;
import java.util.Map;


public class RobotFactory
{
	Map <String, IRobot> shapes = new HashMap<>();

	public int totalObjectsCreated ( )
	{
		return shapes.size();
	}

	public IRobot getRobotFromFactory ( String category ) throws Exception
	{
		IRobot robotCategory;

		if ( shapes.containsKey( category ) )
		{
			robotCategory = shapes.get( category );
		}
		else
		{
			switch ( category ) {
				case "King":
					System.out.println( "We do not have King Robot. So we are creating a King Robot now." );
					robotCategory = new Robot( "King" );
					shapes.put( "King", robotCategory );
					break;
				case "Queen":
					System.out.println( "We do not have Queen Robot. So we are creating a Queen Robot now." );
					robotCategory = new Robot( "Queen" );
					shapes.put( "Queen", robotCategory );
					break;
				default:
					throw new Exception( " Robot Factory can create only king and queen type robots" );
			}
		}
		return robotCategory;
	}

}
