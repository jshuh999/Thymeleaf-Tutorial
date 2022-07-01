package org.datastreams.thymeleafgtvg.business.repositories;

import org.datastreams.thymeleafgtvg.business.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerJpaRepository extends JpaRepository<Customer, Long> {
}
