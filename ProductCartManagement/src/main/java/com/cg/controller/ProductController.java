package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Product;
import com.cg.service.IProductService;
//Product Controller
@RestController
@RequestMapping("/products")
public class ProductController {
	//Creating object of IProductService
	@Autowired IProductService service;
	//Displaying all Products, Generate a get request on localhost:3000/products
	@GetMapping(produces= {"application/json"})
	public List<Product> getall() {
		return service.getall();
	}
	//Adding Product, Generate a Post request with body on localhost:3000/products/addProduct
	@PostMapping(value="/addProduct",consumes={"application/json"})
	public String addProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
	//Displaying a particular Product, Genrate a Get request with id as parameter on localhost:3000/products/"yourId"
	@GetMapping(value="/{id}",produces= {"application/json"})
	public Product getById(@PathVariable String id) {
		return service.getById(id);
	}
	//Updating a product information, Generate a Put request with body on localhost:3000/products/update
	@PutMapping(value="/update",consumes= {"application/json"})
	public String update(@RequestBody Product product) {
		service.update(product);
		return "Product Updated";
	}
	//Deleting a product, Generate a Delete request with id as parameter on localhost:3000/products/delete/"yourId"
	@DeleteMapping(value="/delete/{id}")
	public String delete(@PathVariable String id) {
		service.delete(id);
		return "Product Deleted";
	}
	
	
}
