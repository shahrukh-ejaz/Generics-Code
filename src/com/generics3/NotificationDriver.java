package com.generics3;


public class NotificationDriver {

    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        service.sendNotification("Your order has been shipped");

        service.sendNotification(4501);

        service.sendNotification(99.5);

        service.sendNotification(true);
    }
}
