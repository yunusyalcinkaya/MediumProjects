package com.example.solid_principles.interfaceSegregation.invalid;

public class PaymentService implements Service{

    @Override
    public void pay() {
        System.out.println("paid");
    }

    @Override
    public void sendNotification() {

    }
}
