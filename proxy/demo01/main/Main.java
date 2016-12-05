
package com.karatas.proxy.demo01.main;

import com.karatas.proxy.demo01.proxyClasses.Proxy;


public class Main
{
	public static void main ( String[] args )
	{
		System.out.println( "-*-*-*-*-*ProxyPatterDemo*-*-*-*-*-" );
		Proxy pxy = new Proxy();
		pxy.doSomeWork();
	}
}
