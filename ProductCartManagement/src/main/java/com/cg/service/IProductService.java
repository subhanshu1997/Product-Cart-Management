package com.cg.service;

import java.util.List;

import com.cg.entity.Product;

public interface IProductService {
	public List<Product> getall();
	public String addProduct(Product p);
	public Product getById(String id);
	public String update(Product p);
	public String delete(String id);
	
}
