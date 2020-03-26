package com.github.narh.sample.exec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.github.narh.sample.bean.Test2Bean;

import lombok.extern.slf4j.Slf4j;

@Component @Slf4j
public class Test2Exec implements AppExec {

  @Autowired
  private Test2Bean test2Bean;

  @Override
  public void exec() throws Exception {
    log.info(test2Bean.toString());
  }

  @Bean
  public Test2Bean getTest2Bean() {
    return new Test2Bean();
  }
}
