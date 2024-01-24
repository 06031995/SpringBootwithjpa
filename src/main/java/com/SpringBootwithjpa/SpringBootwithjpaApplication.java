package com.SpringBootwithjpa;

import java.util.*;
import java.util.stream.Collectors;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringBootwithjpa.dao.UserRepo;
import com.SpringBootwithjpa.model.User;

@SpringBootApplication
public class SpringBootwithjpaApplication {
  //Run This class
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootwithjpaApplication.class, args);
		UserRepo repository = run.getBean(UserRepo.class);
		
		//  Save object into database
		/*   
		  User user = new User(); 
		  user.setName("Rahull"); 
		  user.setCity("pune");
		  
		  User user1 = new User();
		  user1.setName("Mau"); 
		  user1.setCity("Jalna");
		  
		  User user2 = new User(); 
		  user2.setName("Shlok"); 
		  user2.setCity("jalna");
		  
		  List<User> al = new ArrayList(); 
		  al.add(user);
		  al.add(user1);
          al.add(user2);
		  
		  repository.saveAll(al);
		 */
		
		//get Object
		/*
		  List<User> all = (List<User>) repository.findAll(); 
		  Comparator<User> c=(x,y)->-x.getName().compareTo(y.getName());
		  List<User> collect =all.stream().sorted(c).collect(Collectors.toList());
		  System.out.println(collect);
		  collect.forEach(a->{ System.out.println(a);
		  });
		*/
		
		//finad by Id
		/*
		 * List<User> allById = repository.findAllById(10); List<User> collect =
		 * allById.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList
		 * ()); System.out.println(collect);
		 */
		
		//find By Name
		/*
		 * String s="d"; List<User> list=repository.findByName("Shlok"); List<User>
		 * collect = list.stream().collect(Collectors.toList());
		 * System.out.println(collect);
		 */
		
		/*
		 * String s="M"; List<User> list = (List<User>) repository.findAll();
		 * 
		 * List<User> collect =
		 * list.stream().filter(i->i.getName().startsWith(s)).collect(Collectors.toList(
		 * )); System.out.println(collect);
		 */
		
		//delet by Id
		//repository.deleteById(1);
		
		//update by id
		/*
		List<User> allById = repository.findAllById(2);
		User user = allById.get(0);
		System.out.println(user);
		user.setName("patil");
		repository.save(user);
	 */
	//***************** custome definder ************************//
		/*
		List<User> byCity = repository.findByCity("pune");
		System.out.println(byCity);
		*/
		
		/* 
		List<User> distinctByName = repository.findDistinctByName("rahul");
		distinctByName.forEach(a->{
			System.out.println(a);
		});
		*/
		
		/* 
		String s="r";
		List<User> byNameLike = repository.findByNameLike(s+"%");
		System.out.println(byNameLike);
		*/
		
		//***************** using Query ************************//
		/*
		List<User> allUsers = repository.getAllUsers();
		allUsers.forEach(a->{
			System.out.println(a);
		});
		*/
		
		List<User> byCity = repository.getByCity("jalna");
		System.out.println(byCity);
		
	}
}
