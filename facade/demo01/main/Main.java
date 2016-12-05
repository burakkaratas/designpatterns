
package com.karatas.facade.demo01.main;

import com.karatas.facade.demo01.robotfacade.RobotFacade;


public class Main
{

	public static void main ( String[] args )
	{
		System.out.println( "*-*-*-*FacadePatternDemo*-*-*-*" );
		RobotFacade rf1 = new RobotFacade();
		rf1.constructRobot( "yellow", "iron" );
		RobotFacade rf2 = new RobotFacade();
		rf2.constructRobot( "green", "steel" );
	}
}
