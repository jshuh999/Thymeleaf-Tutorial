package org.datastreams.thymeleafgtvg.business.services;

import org.datastreams.thymeleafgtvg.business.entities.Product;
import org.datastreams.thymeleafgtvg.business.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private final ProductRepository productRepository;

  public ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public List<Product> findAll() {
    return productRepository.findAll();
  }

  @Override
  public Product findById(Integer id) {
    return productRepository.findById(id);
  }
}
