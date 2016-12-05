
package com.karatas.facade.demo01.robotfacade;

import com.karatas.facade.demo01.parts.RobotBody;
import com.karatas.facade.demo01.parts.RobotColor;
import com.karatas.facade.demo01.parts.RobotMetal;


public class RobotFacade
{
	RobotColor rc;
	RobotBody rb;
	RobotMetal rm;

	public RobotFacade()
	{
		rc = new RobotColor();
		rb = new RobotBody();
		rm = new RobotMetal();
	}

	public void constructRobot ( String color, String metal )
	{
		System.out.println( "\n creation of the robot start" );
		rc.setColor( color );
		rm.setMetal( metal );
		rb.createBody();
		System.out.println( "\n robot creation end\n" );
	}
}
