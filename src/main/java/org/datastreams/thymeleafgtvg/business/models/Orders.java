package org.datastreams.thymeleafgtvg.business.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
public class Orders {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Calendar orderDate;
  @ManyToOne
  @JoinColumn(name = "customer_id")
  private Customer customer;

  @OneToMany
  private Set<OrderLine> orderLines = new LinkedHashSet<>();
}
