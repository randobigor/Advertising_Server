package com.randob.advertising_server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author randobigor
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Report {
  private String category_name;
  private Integer count;
}
