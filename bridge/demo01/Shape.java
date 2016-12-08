
package com.karatas.bridge.demo01;

abstract class Shape
{
	protected IColor color;

	protected Shape(IColor c)
	{
		this.color = c;
	}

	abstract void drawShape ( int border );

	abstract void modifyBorder ( int border, int increment );
}
