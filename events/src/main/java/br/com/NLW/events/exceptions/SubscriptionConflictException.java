package br.com.NLW.events.exceptions;

public class SubscriptionConflictException extends RuntimeException{
	public SubscriptionConflictException(String msg) {
		super(msg);
	}
}
