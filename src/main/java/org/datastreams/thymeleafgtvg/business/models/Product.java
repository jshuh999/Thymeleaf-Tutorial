package org.datastreams.thymeleafgtvg.business.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private boolean inStock = false;
  private BigDecimal price;
  @OneToMany
  @JoinTable(name = "comment")
  private List<Comment> comments;

}
