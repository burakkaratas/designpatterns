
package com.karatas.chain.demo01;

public class Message
{
	public String text;
	public MessagePriority messagePriority;

	public Message(String msg, MessagePriority priority)
	{
		this.text = msg;
		this.messagePriority = priority;
	}
}
