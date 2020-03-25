package com.github.narh.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class TestBean {

	@Value("${foo:1}")
	private Integer foo;
	@Value("${test:hoge}")
	private String test;
	@Value("${key:fuga}")
	private String key;
}
