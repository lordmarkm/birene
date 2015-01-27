package com.birene.core.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class BireneSupportConfig {

    @Bean
    public DozerBeanMapper mapper() {
        return new DozerBeanMapper();
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource msgs = new ResourceBundleMessageSource();
        msgs.setBasenames("main", "guest", "admin");
        return msgs;
    }
}
