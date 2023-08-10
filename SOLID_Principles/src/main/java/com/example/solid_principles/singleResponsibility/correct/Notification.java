package com.example.solid_principles.singleResponsibility.correct;

public class Notification {

    public void sendEmail() {
        // email sending operations
        System.out.println("email sent");
    }

    public void sendSms() {
        // sms sending operations
        System.out.println("sms sent");
    }
}
