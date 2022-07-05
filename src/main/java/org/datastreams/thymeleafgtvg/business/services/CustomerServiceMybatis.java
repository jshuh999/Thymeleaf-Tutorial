package org.datastreams.thymeleafgtvg.business.services;

import org.datastreams.thymeleafgtvg.business.entities.Customer;
import org.datastreams.thymeleafgtvg.business.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class CustomerServiceMybatis implements CustomerService {

  @Autowired
  private final CustomerMapper customerMapper;

  public CustomerServiceMybatis(CustomerMapper customerMapper) {
    this.customerMapper = customerMapper;
  }

  @Override
  public List<Customer> findAll() {
    return customerMapper.findAll();
  }

  @Override
  public Customer findById(Integer id) {
    return customerMapper.findById(id);
  }
}
