package com.example.solid_principles.interfaceSegregation.valid;

public class NotificationController implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("sent notification");
    }
}
