package com.attech.swagger.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.spring4all.swagger.EnableSwagger2Doc;

/**
 * Desc:
 * Author: Aaron
 * Time: 2018/7/14 22:09.
 * Version: v1.0
 */
@Configuration
@EnableSwagger2Doc
@PropertySource(value = "classpath:application-swagger.properties")
public class EducationSwaggerConfig extends WebMvcConfigurerAdapter  {

    /**
     * 注入swagger资源文件
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
