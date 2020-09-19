package com.igor.product.api;

import com.igor.product.domain.service.ProductService;
import com.igor.product.infra.repository.document.ProductDocument;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class ProductHandler {

    private final ProductService productService;

    public ProductHandler(ProductService productService) {
        this.productService = productService;
    }

    public Mono<ServerResponse> getProducts(ServerRequest serverRequest) {
        Flux<ProductDocument> products = productService.findProducts();
        return ServerResponse.ok().body(products, ProductDocument.class);
    }

    public Mono<ServerResponse> getProductById(ServerRequest serverRequest) {
        String id = serverRequest.pathVariable("id");
        Mono<ProductDocument> product = productService.findProductById(id);
        return ServerResponse.ok().body(product, ProductDocument.class);
    }
}
