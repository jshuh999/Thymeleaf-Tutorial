package org.datastreams.thymeleafgtvg.business.repositories;

import org.datastreams.thymeleafgtvg.business.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<Product, Long> {
}
