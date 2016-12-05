
package com.karatas.proxy.demo01.proxyClasses;

import com.karatas.proxy.demo01.originalClasses.ConcreteSubject;
import com.karatas.proxy.demo01.originalClasses.Subject;


public class Proxy extends Subject
{
	ConcreteSubject cs;

	@Override
	public void doSomeWork ( )
	{
		System.out.println( "proxy call happening now" );
		if ( null == cs )
		{
			cs = new ConcreteSubject();
		}
		cs.doSomeWork();
	}
}
