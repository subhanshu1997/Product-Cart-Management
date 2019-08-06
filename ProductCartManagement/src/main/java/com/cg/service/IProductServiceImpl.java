package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.IProductRepo;
import com.cg.entity.Product;
import com.cg.exception.ApplicationException;

@Service
@Transactional
public class IProductServiceImpl implements IProductService{
@Autowired IProductRepo dao;
	@Transactional(readOnly=true)
	public List<Product> getall() {
		if(dao.findAll().isEmpty()) {
			throw new ApplicationException("No Products Exist");
		}
		return dao.findAll();
	}
	@Transactional
	public String addProduct(Product p) {
		if(dao.existsById(p.getProductId())) {
			throw new ApplicationException("Product Already Exists");
		}
		else {
			dao.save(p);
			return "Product Added";
			}
	}
	@Transactional(readOnly=true)
	public Product getById(String id) {
		Optional<Product> product=dao.findById(id);
		if(product.isPresent()) {
			return product.get();
		}
		else {
			throw new ApplicationException("No Product Exists");
		}
	}
	@Transactional
	public String update(Product p) {
		String id=p.getProductId();
		this.delete(id);
		this.addProduct(p);
		return "Product Updated";
	}
	@Transactional
	public String delete(String id) {
		 dao.delete(this.getById(id));
		 return "Product Deleted";
	}

}
