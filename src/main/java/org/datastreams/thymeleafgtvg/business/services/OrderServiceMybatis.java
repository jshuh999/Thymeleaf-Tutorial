package org.datastreams.thymeleafgtvg.business.services;

import org.datastreams.thymeleafgtvg.business.entities.Order;
import org.datastreams.thymeleafgtvg.business.entities.OrderLine;
import org.datastreams.thymeleafgtvg.business.mapper.CustomerMapper;
import org.datastreams.thymeleafgtvg.business.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class OrderServiceMybatis implements OrderService{

  @Autowired
  private final OrderMapper orderMapper;

  public OrderServiceMybatis(OrderMapper orderMapper) {
    this.orderMapper = orderMapper;
  }

  @Override
  public List<Order> findAll() {
    return orderMapper.findAll();
  }

  @Override
  public Order findById(Integer id) {
    return orderMapper.findById(id);
  }

  @Override
  public List<Order> findByCustomerId(Integer customerId) {
    return orderMapper.findByCustomerId(customerId);
  }

  @Override
  public List<OrderLine> findByOrderId(Integer orderId) {
    return orderMapper.findByOrderId(orderId);
  }
}
