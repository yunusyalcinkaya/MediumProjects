package com.example.DTOAndModelMapperUsage.business.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class CreateProductResponse {
    private UUID id;
    private String name;
    private String description;
    private double purchasePrice;
    private double salePrice;
    private int stock;
}
