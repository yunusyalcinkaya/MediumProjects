package com.example.solid_principles.interfaceSegregation.invalid;

public class NotificationService implements Service{
    @Override
    public void pay() {

    }

    @Override
    public void sendNotification() {
        System.out.println("sent notification");
    }
}
