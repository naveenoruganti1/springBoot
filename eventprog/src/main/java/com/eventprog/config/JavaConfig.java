package com.eventprog.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.eventprog.controller", "com.eventprog.listener" })
public class JavaConfig {

}
