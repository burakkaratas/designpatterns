
package com.karatas.factory.demo01;

abstract class IAnimalFactory
{
	public abstract IAnimal getAnimalType ( String type ) throws Exception;
}
