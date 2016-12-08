
package com.karatas.prototype.demo01.car;

public class BMW extends BasicCar
{
	public BMW(String modelName)
	{
		this.modelName = modelName;
	}

	@Override
	public BasicCar clone ( ) throws CloneNotSupportedException
	{
		return (BMW) super.clone();
	}
}
