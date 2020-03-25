package com.github.narh.sample.bean;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class Test1Bean {

  @Value("#{test1[foo]?:1}")
  private Integer foo;
  @Value("#{test1[test]?:'hoge'}")
  private String test1;
  @Value("#{test1[key]?:'fuga'}")
  private String key1;
}
