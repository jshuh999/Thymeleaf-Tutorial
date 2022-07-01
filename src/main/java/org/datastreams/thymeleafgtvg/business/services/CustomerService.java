package org.datastreams.thymeleafgtvg.business.services;


import org.datastreams.thymeleafgtvg.business.entities.Customer;

import java.util.List;

public interface CustomerService {

  public List<Customer> findAll();
  public Customer findById(final Integer id);
}
