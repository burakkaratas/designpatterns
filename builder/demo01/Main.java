
package com.karatas.builder.demo01;

public class Main
{
	public static void main ( String[] args )
	{
		System.out.println( "***BuilderPatternDemo***\n" );

		Director director = new Director();

		IBuilder carBuilder = new Car();
		IBuilder motorBuilder = new MotorCycle();

		director.construct( carBuilder );
		Product p1 = carBuilder.getVehicle();
		p1.show();

		director.construct( motorBuilder );
		Product p2 = motorBuilder.getVehicle();
		p2.show();
	}
}
