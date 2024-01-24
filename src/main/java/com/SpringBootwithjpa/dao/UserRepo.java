package com.SpringBootwithjpa.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.SpringBootwithjpa.model.User;


public interface UserRepo extends CrudRepository<User, Integer>{

	List findAllById(int i);

	List<User> findByName(String string);
      
	
	public List<User> findByCity(String string);
	
	public List<User> findDistinctByName(String string);

	//public List<User> finaBynameAndcity(String string, String string2);
	
	public List<User> findByNameLike(String likepattern);
	
	@Query(value = "select * from user",nativeQuery = true)
	public List<User> getAllUsers();
    
	@Query(value = "select * from user where city=:city",nativeQuery = true)
	public List<User> getByCity(String city);
	

}
