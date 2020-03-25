package com.github.narh.sample;

public interface ThrowableConsumer<T> {
  void accept(T t) throws Exception;
}
