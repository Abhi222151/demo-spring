package com.ibm.test.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ibm.test.springboot.entity.User;

public interface UserRepoitory extends CrudRepository<User, Integer> {

	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name, String city);
}
