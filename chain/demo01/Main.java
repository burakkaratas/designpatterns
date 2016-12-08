
package com.karatas.chain.demo01;

public class Main
{

	public static void main ( String[] args )
	{
		System.out.println( "***ChainofResponsibilityPatternDemo***\n" );
		IReceiver faxHandler, emailHandler;
		emailHandler = new EmailErrorHandler( null );
		faxHandler = new FaxErrorHandler( emailHandler );

		IssueRaiser raiser = new IssueRaiser( faxHandler );

		Message m1 = new Message( "Fax is reaching late to the destination", MessagePriority.NORMAL );
		Message m2 = new Message( "Email is not going", MessagePriority.HIGHT );
		Message m3 = new Message( "In Email, BCC field is disabled occasionally", MessagePriority.NORMAL );
		Message m4 = new Message( "Fax is not reaching destination", MessagePriority.HIGHT );

		raiser.raiseMessage( m1 );
		raiser.raiseMessage( m2 );
		raiser.raiseMessage( m3 );
		raiser.raiseMessage( m4 );
	}

}
