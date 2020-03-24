package com.github.narh.sample.validator;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;

import com.github.narh.sample.annotation.X_Required;
import com.github.narh.sample.exception.ValidationException;

public class RequiredValidator<T> implements Validator<T> {

  private final String MESSAGE=" is required.";
  private final String GETTER_PREFIX = "get";

  @Override
  public void validate(T bean) throws ValidationException {
    Class<? extends Object> cls    = bean.getClass();
    Optional<Field>         fields = Arrays.asList(cls.getDeclaredFields()).stream()
        .filter(f -> null != f.getAnnotation(X_Required.class))
        .filter(f -> isNull(f, bean))
        .findFirst();
    if (fields.isPresent()) {
      throw new ValidationException(fields.get().getName() + MESSAGE);
    }
  }

  private boolean isNull(Field field, T bean) {
    String getterName = GETTER_PREFIX;
    getterName += StringUtils.capitalize(field.getName());
    try {
      Method getter = bean.getClass().getMethod(getterName, new Class<?>[] {});
      return (null == getter.invoke(bean, new Object[] {}));
    }
    catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
        | InvocationTargetException e) {
      return false;
    }
  }
}
