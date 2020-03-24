package com.github.narh.sample.exception;

public class ValidationException extends RuntimeException {

  public ValidationException(final String message) {
    super(message);
  }

  public ValidationException(final Throwable throwable) {
    super(throwable);
  }
}
