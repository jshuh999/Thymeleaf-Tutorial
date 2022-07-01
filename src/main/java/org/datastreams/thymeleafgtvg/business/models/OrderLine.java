package org.datastreams.thymeleafgtvg.business.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@Entity
public class OrderLine {

  @Id
  private Long id;
  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;
  private Integer amount;
  private BigDecimal purchasePrice;

}
