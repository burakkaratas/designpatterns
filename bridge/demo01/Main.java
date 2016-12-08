
package com.karatas.bridge.demo01;

public class Main
{

	public static void main ( String[] args )
	{
		System.out.println( "*****BRIDGE PATTERN*****" );
		System.out.println( "\nColoring Triangle:" );
		IColor green = new GreenColor();
		Shape triangleShape = new Triangle( green );
		triangleShape.drawShape( 20 );
		triangleShape.modifyBorder( 20, 3 );

		System.out.println( "\n\nColoring Rectangle :" );
		IColor red = new RedColor();
		Shape rectangleShape = new Rectangle( red );
		rectangleShape.drawShape( 50 );
		rectangleShape.modifyBorder( 50, 2 );
	}

}
