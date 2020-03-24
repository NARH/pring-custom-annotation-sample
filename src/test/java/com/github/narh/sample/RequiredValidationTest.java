package com.github.narh.sample;

import org.junit.Test;

import com.github.narh.sample.exception.ValidationException;
import com.github.narh.sample.validator.RequiredValidator;

public class RequiredValidationTest {

  RequiredValidator<SampleBean> validator = new RequiredValidator<SampleBean>();

  @Test(expected = ValidationException.class)
  public void testString() throws Exception {
    System.out.println("=== name validate===");
    SampleBean bean = new SampleBean();
    bean.setDescription("foo");
    validator.validate(bean);
  }

  @Test(expected = ValidationException.class)
  public void testInt() throws Exception {
    System.out.println("=== value validate===");
    SampleBean bean = new SampleBean();
    bean.setName("foo");
    bean.setDescription("bar");
    validator.validate(bean);
  }
}
