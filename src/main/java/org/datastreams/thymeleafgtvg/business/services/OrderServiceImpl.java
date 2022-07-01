package org.datastreams.thymeleafgtvg.business.services;

import org.datastreams.thymeleafgtvg.business.entities.Order;
import org.datastreams.thymeleafgtvg.business.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{

  @Autowired
  private final OrderRepository orderRepository;

  public OrderServiceImpl(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  @Override
  public List<Order> findAll() {
    return orderRepository.findAll();
  }

  @Override
  public Order findById(Integer id) {
    return orderRepository.findById(id);
  }

  @Override
  public List<Order> findByCustomerId(Integer customerId) {
    return orderRepository.findByCustomerId(customerId);
  }
}
