package io.github.smallintro.mybatis.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {
    private int productId;
    private String productName;
    private double productPrice;
    private int productCount;
}
