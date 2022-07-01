package org.datastreams.thymeleafgtvg.business.repositories;

import org.datastreams.thymeleafgtvg.business.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderJpaRepository extends JpaRepository<Orders, Long> {

  public List<Orders> findByCustomerId(final Long customerId);
}
