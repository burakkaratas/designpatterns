
package com.karatas.flyweight.notdemo;

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
				case "small":
					System.out.println( "We do not have Small Robot. So we are creating a Small Robot now." );
					robotCategory = new SmallRobot();
					shapes.put( "small", robotCategory );
					break;
				case "large":
					System.out.println( "We do not have Large Robot. So we are creating a Large Robot now." );
					robotCategory = new LargeRobot();
					shapes.put( "large", robotCategory );
					break;
				default:
					throw new Exception( " Robot Factory can create only small and large shapes" );
			}
		}
		return robotCategory;
	}

}
