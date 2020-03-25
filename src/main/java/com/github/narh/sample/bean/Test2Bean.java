package com.github.narh.sample.bean;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class Test2Bean {

  @Value("${test2.foo:0}")
  private Integer foo;
  @Value("${test2.test2:hoge}")
  private String test2;
  @Value("${test2.key2:val2}")
  private String key2;
}
