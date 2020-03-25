package com.github.narh.sample.exec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.github.narh.sample.bean.Test1Bean;

@Component
public class Test1Exec implements AppExec {

  @Autowired
  private Test1Bean testBean;

  @Override
  public void exec() throws Exception {
    System.out.println(testBean.toString());
  }

  @Bean
  public Test1Bean getTest1Bean() {
    return new Test1Bean();
  }
}
