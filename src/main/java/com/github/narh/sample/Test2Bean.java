package com.github.narh.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class Test2Bean {

	@Value("${foo}")
	private Integer foo;
	@Value("${test2}")
	private String test2;
	@Value("${key2}")
	private String key2;
}
