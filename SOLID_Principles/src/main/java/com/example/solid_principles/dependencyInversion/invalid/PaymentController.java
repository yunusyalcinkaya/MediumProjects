package com.example.solid_principles.dependencyInversion.invalid;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
@AllArgsConstructor
public class PaymentController {
    PaymentService service;

    @GetMapping
    public void getPayment(){
        service.create();
    }
}
