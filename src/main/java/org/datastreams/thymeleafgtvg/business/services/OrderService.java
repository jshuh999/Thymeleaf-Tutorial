package org.datastreams.thymeleafgtvg.business.services;


import org.datastreams.thymeleafgtvg.business.entities.Order;
import org.datastreams.thymeleafgtvg.business.entities.OrderLine;

import java.util.List;
import java.util.Optional;

public interface OrderService {
  public List<Order> findAll();
  public Order findById(final Integer id);
  public List<Order> findByCustomerId(final Integer customerId);

  public List<OrderLine> findByOrderId(final Integer orderId);
}
