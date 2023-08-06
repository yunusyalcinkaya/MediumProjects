package com.example.DTOAndModelMapperUsage.business.services;

import com.example.DTOAndModelMapperUsage.business.dto.CreateProductRequest;
import com.example.DTOAndModelMapperUsage.business.dto.CreateProductResponse;
import com.example.DTOAndModelMapperUsage.business.dto.GetAllProductsResponse;

import java.util.List;

public interface ProductService {
    List<GetAllProductsResponse> getAll();
    CreateProductResponse create(CreateProductRequest request);
}
