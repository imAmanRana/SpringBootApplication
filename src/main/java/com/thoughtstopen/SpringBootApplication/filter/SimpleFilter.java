/**
 * 
 */
package com.thoughtstopen.SpringBootApplication.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;

/**
 * @author amand
 *
 */
@Component
public class SimpleFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("Remote Host : "+request.getRemoteHost());
		System.out.println("Remote Address : "+request.getRemoteAddr());
		chain.doFilter(request, response);

	}

}
