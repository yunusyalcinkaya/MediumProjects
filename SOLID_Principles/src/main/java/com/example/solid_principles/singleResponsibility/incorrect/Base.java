package com.example.solid_principles.singleResponsibility.incorrect;

public class Base {

    public void sendNotification(String option){
        if("email".equalsIgnoreCase(option)){
            // email sending operations
            System.out.println("email sent");
        } else if ("sms".equalsIgnoreCase(option)) {
            // sms sending operations
            System.out.println("sms sent");
        }
    }

    public void pay(String option){
        if("creditCard".equalsIgnoreCase(option)){
            // payment operations
            System.out.println("paid");
        }
        else if("cash".equalsIgnoreCase(option)){
            // payment operations
            System.out.println("paid");
        }
    }
}
