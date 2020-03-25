package com.github.narh.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class TestBean {

	@Value("${foo}")
	private Integer foo;
	@Value("${test}")
	private String test;
	@Value("${key}")
	private String key;
}
