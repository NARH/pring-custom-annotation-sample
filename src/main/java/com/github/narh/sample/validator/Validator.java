package com.github.narh.sample.validator;

import javax.xml.bind.ValidationException;

public interface Validator<T> {

  public void validate(T bean) throws ValidationException;
}
