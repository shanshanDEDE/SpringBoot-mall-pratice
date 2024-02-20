package com.willy.springbootmall.service.impl;

import com.willy.springbootmall.dao.ProductDao;
import com.willy.springbootmall.model.Product;
import com.willy.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
