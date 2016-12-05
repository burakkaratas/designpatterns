
package com.karatas.observer.demo02;

public interface ISubject
{
	void notifyObservers ( int flag );

	void register ( IObserver o );

	void unregister ( IObserver o );

}
