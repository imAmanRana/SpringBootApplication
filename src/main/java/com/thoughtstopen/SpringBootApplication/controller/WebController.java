/**
 * 
 */
package com.thoughtstopen.SpringBootApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author amand
 *
 */
@Controller
public class WebController {

	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/view-products")
	public String viewProduction() {
		return "view-products";
	}

	@RequestMapping("/add-products")
	public String addProducts() {
		return "add-products";
	}
	
	@RequestMapping("/locale")
	public String locale() {
		return "locale";
	}

}
