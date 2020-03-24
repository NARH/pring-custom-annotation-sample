package com.github.narh.sample;

import com.github.narh.sample.annotation.X_Required;

import lombok.Data;

@Data
public class SampleBean {

  @X_Required
  private String name;

  @X_Required
  private Integer value;

  private String description;
}
