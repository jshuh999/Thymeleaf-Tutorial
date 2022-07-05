package org.datastreams.thymeleafgtvg.business.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.datastreams.thymeleafgtvg.business.entities.Customer;

import java.util.List;

@Mapper
public interface CustomerMapper{

  @Select("select id, name, customer_since from customer")
  public List<Customer> findAll();

  @Select("select id, name, customer_since from customer where id = #{id}")
  public Customer findById(final Integer id);
}