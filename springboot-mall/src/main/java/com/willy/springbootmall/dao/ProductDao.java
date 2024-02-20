package com.willy.springbootmall.dao;

import com.willy.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
