
package com.karatas.builder.demo01;

public class MotorCycle implements IBuilder
{
	private Product product = new Product();

	@Override
	public void buildBody ( )
	{
		product.add( "This is a body of a Motorcycle" );
	}

	@Override
	public void insertWheels ( )
	{
		product.add( "2 wheels are added" );
	}

	@Override
	public void addHeadlights ( )
	{
		product.add( "1 Headlights are added" );
	}

	@Override
	public Product getVehicle ( )
	{
		return product;
	}

}
