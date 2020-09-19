package com.igor.product.infra.repository.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class ProductDocument {

    @Id
    private String id;
    private String name;
    private String description;
    private List<String> images;
}
