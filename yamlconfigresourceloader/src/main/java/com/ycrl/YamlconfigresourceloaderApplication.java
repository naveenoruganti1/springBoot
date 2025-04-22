package com.ycrl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.ycrl.beans.Contract;
import com.ycrl.initializers.YamlConfigApplicationContextInitializer;

@SpringBootApplication
// @PropertySource("classpath:app-global.yml") - it wont works
public class YamlconfigresourceloaderApplication {

	public static void main(String[] args) {
		// ApplicationContext context =
		// SpringApplication.run(YamlconfigresourceloaderApplication.class, args);
		SpringApplication springApplication = new SpringApplicationBuilder(YamlconfigresourceloaderApplication.class)
				.initializers(new YamlConfigApplicationContextInitializer()).build();
		ApplicationContext context = springApplication.run(args);
		Contract contract = context.getBean(Contract.class);
		System.out.println(contract);
	}

}
