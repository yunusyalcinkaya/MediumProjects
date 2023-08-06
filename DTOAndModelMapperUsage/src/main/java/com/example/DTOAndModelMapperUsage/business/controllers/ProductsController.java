package com.example.DTOAndModelMapperUsage.business.controllers;

import com.example.DTOAndModelMapperUsage.business.dto.CreateProductRequest;
import com.example.DTOAndModelMapperUsage.business.dto.CreateProductResponse;
import com.example.DTOAndModelMapperUsage.business.dto.GetAllProductsResponse;
import com.example.DTOAndModelMapperUsage.business.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductsController {

    private final ProductService service;

    @GetMapping
    public List<GetAllProductsResponse> getAll(){
        return service.getAll();
    }

    @PostMapping
    public CreateProductResponse create(@RequestBody CreateProductRequest request){
        return service.create(request);
    }
}
