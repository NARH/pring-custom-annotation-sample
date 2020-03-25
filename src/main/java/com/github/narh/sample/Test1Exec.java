package com.github.narh.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@Component @Configuration
@PropertySource(value = {"classpath:test.properties"})
public class Test1Exec implements AppExec {

	@Autowired
	private TestBean testBean;

	@Override
	public void exec() throws Exception {
		System.out.println(testBean.toString());
	}

	@Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
