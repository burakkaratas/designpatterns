
package com.karatas.factory.demo01;

public class Main
{

	public static void main ( String[] args ) throws Exception
	{
		System.out.println( "***Factory Pattern Demo***\n" );

		IAnimalFactory animalFactory = new ConcreteFactory();
		IAnimal DuckType = animalFactory.getAnimalType( "Duck" );
		DuckType.speak();

		IAnimal TigerType = animalFactory.getAnimalType( "Tiger" );
		TigerType.speak();

		IAnimal LionType = animalFactory.getAnimalType( "Lion" );
		LionType.speak();
	}
}
