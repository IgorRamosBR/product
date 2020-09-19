package com.igor.product.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String id;
    private String name;
    private String description;
    private List<String> images;
}
