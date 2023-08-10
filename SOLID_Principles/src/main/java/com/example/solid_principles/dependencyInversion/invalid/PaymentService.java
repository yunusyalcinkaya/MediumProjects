package com.example.solid_principles.dependencyInversion.invalid;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class PaymentService {

    public void create(){
        System.out.println("created payment");
    }
}
