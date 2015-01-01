package com.birene.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.birene.core")
@EnableTransactionManagement
public class BireneCoreConfig {

}
