
package com.karatas.flyweight.demo01;

public class Robot implements IRobot
{

	String robotType;
	public String colorOfRobot;

	public Robot(String robotType)
	{
		this.robotType = robotType;
	}

	public void setColorOfRobot ( String colorOfRobot )
	{
		this.colorOfRobot = colorOfRobot;
	}

	@Override
	public void print ( )
	{
		System.out.println( " This is a " + robotType + " type robot with " + colorOfRobot + "color" );
	}
}
