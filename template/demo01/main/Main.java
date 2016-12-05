
package com.karatas.template.demo01.main;

import com.karatas.template.demo01.engineering.BasicEngineering;
import com.karatas.template.demo01.engineering.ComputerScience;
import com.karatas.template.demo01.engineering.Electronics;

public class Main
{

	public static void main ( String[] args )
	{
		System.out.println( "-*-*-*-*TemplateMethodPatternDemo*-*-*-*-" );
	
		BasicEngineering bs = new ComputerScience();
		System.out.println( "Computer sc Papers: " );
		bs.Papers();
		System.out.println(  );
		bs = new Electronics();
		System.out.println( "Electronics Papers: " );
		bs.Papers();
	}
}
