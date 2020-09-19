package com.igor.product.infra.repository;

import com.igor.product.infra.repository.document.ProductDocument;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<ProductDocument, String> {
}
