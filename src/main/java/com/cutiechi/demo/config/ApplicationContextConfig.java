package com.cutiechi.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Spring Application Context 配置类, 相当于 applicationContext.xml
 *
 * @author Cutie Chi
 */
@Configuration
@ComponentScan(
    basePackages = {
        "com.cutiechi.demo"
    },
    excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class),
        @Filter(type = FilterType.ANNOTATION, value = Controller.class)
    }
)
public class ApplicationContextConfig {

}
