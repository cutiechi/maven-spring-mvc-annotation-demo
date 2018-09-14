package com.cutiechi.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Spring MVC Dispatcher Servlet 配置类, 相当于 dispatcher-servlet.xml
 *
 * @author Cutie Chi
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.cutiechi.demo.web.controller")
public class DispatcherServletConfig implements WebMvcConfigurer {

    /**
     * 视图解析器 Bean
     *
     * 前缀为 /WEB-INF/pages/ , 后缀为 .jsp
     */
    @Bean
    public ViewResolver viewResolver () {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
