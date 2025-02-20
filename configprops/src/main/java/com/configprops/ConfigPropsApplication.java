package com.configprops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.configprops.beans.Book;

@SpringBootApplication
//@EnableConfigurationProperties
public class ConfigPropsApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ConfigPropsApplication.class, args);
		Book book = context.getBean(Book.class);
		System.out.println(book);
	}
}
