/**
 * 
 */
package com.thoughtstopen.SpringBootApplication.service;

import java.util.Collection;

import com.thoughtstopen.SpringBootApplication.model.Product;

/**
 * @author amand
 *
 */
public interface ProductService {

	public abstract void createProduct(Product product);
	public abstract void updateProduct(String id,Product product);
	public abstract void deleteProduct(String id);
	public abstract Collection<Product> getProducts();
	
}
