package com.example.solid_principles.dependencyInversion.valid;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class PaymentManager implements PaymentService{

    public void create(){
        System.out.println("created payment");
    }
}
