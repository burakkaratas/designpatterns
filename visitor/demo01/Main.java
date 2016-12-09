
package com.karatas.visitor.demo01;

public class Main
{
	public static void main ( String[] args )
	{
		System.out.println( "***VisitorPatternDemo***\n" );
		IVisitor v = new Visitor();
		MyClass myClass = new MyClass();
		myClass.accept( v );
	}

}
