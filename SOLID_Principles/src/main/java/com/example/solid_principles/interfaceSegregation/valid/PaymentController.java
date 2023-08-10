package com.example.solid_principles.interfaceSegregation.valid;

public class PaymentController implements PaymentService{
    @Override
    public void pay() {
        System.out.println("paid");
    }
}
