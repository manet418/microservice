package org.example.service;

import org.example.entity.Discount;
import org.example.entity.Product;
import org.example.repository.ProductRepository;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.math.BigDecimal;

@Service
public class ProductService {

    private ProductRepository productRepository;

    private final RestClient restClient;

    public ProductService(ProductRepository productRepository, RestClient restClient) {
        this.productRepository = productRepository;
        this.restClient = restClient;
    }


    public Product create(Product product) {
        Discount discount = restClient.get()
                .uri("http://localhost:9090/api/v1/discounts/{discount}", product.getCodeName())
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(Discount.class);
        product.setPrice(new BigDecimal(100).subtract(discount.getCodeValue()).multiply(product.getPrice()).divide(new BigDecimal(100)));
        return productRepository.save(product);
    }
}
