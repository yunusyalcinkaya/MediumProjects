package com.example.DTOAndModelMapperUsage.business.concretes;

import com.example.DTOAndModelMapperUsage.business.dto.CreateProductRequest;
import com.example.DTOAndModelMapperUsage.business.dto.CreateProductResponse;
import com.example.DTOAndModelMapperUsage.business.dto.GetAllProductsResponse;
import com.example.DTOAndModelMapperUsage.business.services.ProductService;
import com.example.DTOAndModelMapperUsage.entities.Product;
import com.example.DTOAndModelMapperUsage.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductManager implements ProductService {

    private final ProductRepository repository;
    private final ModelMapper mapper;

    public List<GetAllProductsResponse> getAll(){
        List<Product> products = repository.findAll();

        List<GetAllProductsResponse> response = products.stream()
                .map(product -> mapper.map(product, GetAllProductsResponse.class))
                .toList();
        return response;
    }

    public CreateProductResponse create(CreateProductRequest request){

        Product product = mapper.map(request, Product.class);
        repository.save(product);

        CreateProductResponse response = mapper.map(product,CreateProductResponse.class);
        return response;
    }

}
