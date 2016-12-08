
package com.karatas.prototype.demo01.main;

import com.karatas.prototype.demo01.car.BMW;
import com.karatas.prototype.demo01.car.BasicCar;
import com.karatas.prototype.demo01.car.Nano;


public class Main
{

	public static void main ( String[] args ) throws CloneNotSupportedException
	{
		System.out.println( "***Prototype Pattern Demo***\n" );
		BasicCar nano_base = new Nano( "Green Nano" );
		nano_base.price = 100000;

		BasicCar ford_basic = new BMW( "BMW Red" );
		ford_basic.price = 500000;

		BasicCar bc1;
		bc1 = nano_base.clone();
		bc1.price = nano_base.price + BasicCar.setPrice();
		System.out.println( "Car is: " + bc1.modelName + " and it’s price is Rs." + bc1.price );

		bc1 = ford_basic.clone();
		bc1.price = ford_basic.price + BasicCar.setPrice();
		System.out.println( "Car is: " + bc1.modelName + " and it’s price is Rs." + bc1.price );
		
	}

}
