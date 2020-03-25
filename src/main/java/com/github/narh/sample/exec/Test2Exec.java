package com.github.narh.sample.exec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.github.narh.sample.bean.Test2Bean;

@Component @Configuration
@PropertySource(value = {"classpath:test2.properties"}, name = "test2")
public class Test2Exec implements AppExec {

  @Autowired
  private Test2Bean test2Bean;

  @Override
  public void exec() throws Exception {
    System.out.println(test2Bean.toString());
  }

  @Bean
  public Test2Bean getTest2Bean() {
    return new Test2Bean();
  }
}
