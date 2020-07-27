/**
 * 
 */
package com.thoughtstopen.SpringBootApplication.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author amand
 *
 */
@Configuration
public class BeanProvider {

	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
