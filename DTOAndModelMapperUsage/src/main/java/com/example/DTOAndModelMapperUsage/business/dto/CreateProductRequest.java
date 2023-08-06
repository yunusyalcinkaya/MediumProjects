package com.example.DTOAndModelMapperUsage.business.dto;

import lombok.Data;

@Data
public class CreateProductRequest {
    private String name;
    private String description;
    private double purchasePrice;
    private double salePrice;
    private int stock;
}
