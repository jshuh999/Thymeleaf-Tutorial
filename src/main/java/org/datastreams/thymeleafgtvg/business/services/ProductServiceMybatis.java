package org.datastreams.thymeleafgtvg.business.services;

import org.datastreams.thymeleafgtvg.business.entities.Product;
import org.datastreams.thymeleafgtvg.business.mapper.CommentMapper;
import org.datastreams.thymeleafgtvg.business.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ProductServiceMybatis implements ProductService {

  @Autowired
  private final ProductMapper productMapper;

  public ProductServiceMybatis(ProductMapper productMapper) {
    this.productMapper = productMapper;
  }

  @Override
  public List<Product> findAll() {
    List<Product> products = productMapper.findAll();
    return products;
  }

  @Override
  public Product findById(Integer id) {
    return productMapper.findById(id);
  }
}
