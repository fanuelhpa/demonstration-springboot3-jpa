package com.fandev.demonstration.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fandev.demonstration.entities.Product;
import com.fandev.demonstration.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
