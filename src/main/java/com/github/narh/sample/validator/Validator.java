package com.github.narh.sample.validator;

import com.github.narh.sample.exception.ValidationException;

public interface Validator<T> {

  public void validate(T bean) throws ValidationException;
}
