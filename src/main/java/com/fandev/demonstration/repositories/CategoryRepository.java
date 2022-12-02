package com.fandev.demonstration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fandev.demonstration.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}
