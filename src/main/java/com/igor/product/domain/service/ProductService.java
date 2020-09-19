package com.igor.product.domain.service;

import com.igor.product.infra.repository.ProductRepository;
import com.igor.product.infra.repository.document.ProductDocument;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Flux<ProductDocument> findProducts() {
        return productRepository.findAll();
    }

    public Mono<ProductDocument> findProductById(String id) {
        return productRepository.findById(id);
    }
}
