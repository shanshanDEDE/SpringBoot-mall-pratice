package com.willy.springbootmall.service;

import com.willy.springbootmall.dto.ProductRequest;
import com.willy.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
}
