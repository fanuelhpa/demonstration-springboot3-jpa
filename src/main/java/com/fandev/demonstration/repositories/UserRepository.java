package com.fandev.demonstration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fandev.demonstration.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
