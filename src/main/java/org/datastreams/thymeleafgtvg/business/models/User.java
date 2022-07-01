package org.datastreams.thymeleafgtvg.business.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  @Id
  private Long id;
  private String firstName;
  private String lastName;
  private String nationality;
  private Integer age;

  public String getName() {
    return this.firstName + " " + this.lastName;
  }



}
