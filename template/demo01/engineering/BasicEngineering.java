
package com.karatas.template.demo01.engineering;

public abstract class BasicEngineering
{

	public void Papers ( )
	{
		Math();
		SoftSkills();
		SpecialPaper();
	}

	private void Math ( )
	{
		System.out.println( "Mathematics" );
	}

	private void SoftSkills ( )
	{
		System.out.println( "SoftSkills" );
	}

	public abstract void SpecialPaper ( );
}
