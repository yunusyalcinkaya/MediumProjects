package com.example.DTOAndModelMapperUsage.business.dto;

import lombok.Data;
import lombok.Getter;

import java.util.UUID;

@Data
public class GetAllProductsResponse {
    private String name;
    private String description;
    private double salePrice;
}
