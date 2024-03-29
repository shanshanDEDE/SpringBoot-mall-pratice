package com.willy.springbootmall.dao;

import com.willy.springbootmall.dto.ProductRequest;
import com.willy.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
}
