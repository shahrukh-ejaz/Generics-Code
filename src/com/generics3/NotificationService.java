package com.generics3;



public class NotificationService {
	
	public <T> void sendNotification(T message) {
		System.out.println("Notification: "+ message);
	}

}
