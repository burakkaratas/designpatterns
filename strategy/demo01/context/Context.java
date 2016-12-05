
package com.karatas.strategy.demo01.context;

import com.karatas.strategy.demo01.choices.IChoice;


public class Context
{
	IChoice myC;

	public void setChoice ( IChoice ic )
	{
		myC = ic;
	}

	public void showChoise ( String s1, String s2 )
	{
		myC.myChoice( s1, s2 );
	}
}
