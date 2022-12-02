package com.fandev.demonstration.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fandev.demonstration.entities.Category;
import com.fandev.demonstration.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		
		List<Category> categories = repository.findAll();
		return categories;
	}
	
	public Category findById(Long id) {
		
		Optional<Category> category = repository.findById(id);
		
		return category.get();
	}
}
