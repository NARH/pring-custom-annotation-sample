package com.github.narh.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class Test2Bean {

	@Value("${foo:0}")
	private Integer foo;
	@Value("${test2:hoge}")
	private String test2;
	@Value("${key2:val2}")
	private String key2;
}
