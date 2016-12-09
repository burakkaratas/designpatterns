
package com.karatas.interpreter.demo01;

public class StringToBinayExp implements IExpression
{
	private String str;

	public StringToBinayExp(String s)
	{
		str = s;
	}

	@Override
	public void interpret ( Context ic )
	{
		ic.getBinaryForm( str );
	}
}
