package com.randob.advertising_server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author randobigor
 **/

@Entity
@Table(name = "monthly")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class YearlyReport {
  @Id
  @Column(name = "name")
  private String name;

  @Column(name = "count")
  private Integer count;
}
