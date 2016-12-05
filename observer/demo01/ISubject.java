
package com.karatas.observer.demo01;

public interface ISubject
{
	void register ( Observer o );

	void unregister ( Observer o );

	void notifyObservers ( );
}
