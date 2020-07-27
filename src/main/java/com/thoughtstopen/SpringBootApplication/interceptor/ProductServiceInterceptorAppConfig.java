/**
 * 
 */
package com.thoughtstopen.SpringBootApplication.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author amand
 *
 */
@Configuration
public class ProductServiceInterceptorAppConfig implements WebMvcConfigurer {

	@Autowired
	ProductServiceInterceptor productServiceInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		WebMvcConfigurer.super.addInterceptors(registry);
		registry.addInterceptor(productServiceInterceptor);
	}

}
