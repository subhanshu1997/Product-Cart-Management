package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//Table
@Table
public class Product {
	//Unique Identifier
	@Id
	String productId;
	//Columns
	@Column(name="name")
	String productName;
	@Column(name="model")
	String productModel;
	@Column(name="price")
	Double productPrice;
	//Setters and Getters
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductModel() {
		return productModel;
	}
	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	//Default constructor
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Parameterized Constructor
	public Product(String productId, String productName, String productModel, Double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productModel = productModel;
		this.productPrice = productPrice;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

}
