package com.github.narh.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@Component @Configuration
@PropertySource(value = {"classpath:test2.properties"})
public class Test2Exec implements AppExec {

	@Autowired
	private Test2Bean test2Bean;

	@Override
	public void exec() throws Exception {
		System.out.println(test2Bean.toString());
	}

	@Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
