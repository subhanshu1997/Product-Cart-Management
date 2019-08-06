package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Product;
//Extending JPARepositoryInterface
public interface IProductRepo extends JpaRepository<Product,String>{
}
