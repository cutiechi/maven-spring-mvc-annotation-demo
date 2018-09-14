package com.cutiechi.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Spring MVC Dispatcher Servlet 配置类, 相当于 dispatcher-servlet.xml
 *
 * @author Cutie Chi
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.cutiechi.demo.web.controller")
public class DispatcherServletConfig implements WebMvcConfigurer {

}
