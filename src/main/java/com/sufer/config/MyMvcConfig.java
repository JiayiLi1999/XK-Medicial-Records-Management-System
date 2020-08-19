package com.sufer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author danger
 * @date 2020/6/9
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyHandlerInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/","/login","/page-login","/register","/page-register","/page-reset-password",
                        "/resetpwd","/page-info","/newInfo",
                        "/css/**","/fonts/**","/images/**","/js/**");

    }
}
