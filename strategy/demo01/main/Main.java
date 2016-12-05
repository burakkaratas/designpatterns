
package com.karatas.strategy.demo01.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.karatas.strategy.demo01.choices.FirstChoice;
import com.karatas.strategy.demo01.choices.IChoice;
import com.karatas.strategy.demo01.choices.SecondChoice;
import com.karatas.strategy.demo01.context.Context;


public class Main
{
	public static void main ( String[] args ) throws IOException
	{
		System.out.println( "*-*-*-*-*StrategyPatternDemo*-*-*-*-*" );
		Scanner sc = new Scanner( System.in );
		IChoice ic = null;
		Context cxt = new Context();
		String in1, in2;

		try
		{
			for ( int i = 1; i <= 2; i++ )
			{
				System.out.println( "enter an integer" );
				in1 = sc.nextLine();
				System.out.println( "Enter another integer:" );
				in2 = sc.nextLine();
				System.out.println( "Enter ur choice(1 or 2)" );
				System.out.println( "Press 1 for Addition, 2 for Concatenation" );
				BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
				String c = br.readLine();
				if ( c.equals( "1" ) )
				{
					ic = new FirstChoice();
				}
				else
				{
					ic = new SecondChoice();
				}
				cxt.setChoice( ic );
				cxt.showChoise( in1, in2 );
			}
		}
		finally
		{
			sc.close();
		}
		System.out.println( "End of Strategy pattern" );
	}
}