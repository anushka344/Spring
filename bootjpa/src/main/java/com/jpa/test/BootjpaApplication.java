package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.repository.UserRepository;
import com.jpa.test.entities.User;
 // Make sure this points to your User entity class


@SpringBootApplication
public class BootjpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootjpaApplication.class, args);
		UserRepository userrep = context.getBean(UserRepository.class);
		
		
		/*  Save
		//first obj
	    User user= new User();
	    user.setName("Anushka");
	    user.setCity("Kolkata");
	    user.setState("WB");
	    
	      //second obj 
	    User user2= new User();
	    user2.setName("Aritri");
	    user2.setCity("Shimla");
	    user2.setState("Hp");
	    
	    //Saving single user
	    //User user1=  userrep.save(user); 
	    //User user3=  userrep.save(user2);
	    //System.out.println(user1);
	    //System.out.println(user3);
	    
	    //Save multiple objects at once
	    List<User> users = List.of(user,user2);
	    Iterable<User> result=userrep.saveAll(users);
	    result.forEach(abc->{
	    	System.out.println(abc);
	    });
	    
	    */
	
		
		/*
		//Update value
		Optional <User> optional=  userrep.findById(8);
		User u = optional.get();
		System.out.println(u);
		if(optional.isPresent())
		{
			u.setState("Assam");
			userrep.save(u);
			System.out.println("Updated");
		}
		else
		System.out.println("Not present");
	    */
		
		/*
		//retrieve data 
		//findById(id) -- returns optional containing data
		Iterable <User> itr= userrep.findAll();
		itr.forEach(u -> {
			System.out.println(u);
		});
		*/
		
		//delete
//		userrep.deleteById(7);
//		System.out.println("deleted");
		
		
		//delete all
//		Iterable <User> all= userrep.findAll();
//		all.forEach(bb ->{
//			System.out.println(bb);
//		});
//		userrep.deleteAll(all);
		
		
		//DERIVED METHODS
//		List<User> ans = userrep.findByNameAndCity("Anushka","Kolkata");
//		ans.forEach(a->{
//			System.out.println(a.getState());
//			});
		
		//Query usage
//		List<User> ans2 = userrep.getallUsers();
//		ans2.forEach(a->{
//			System.out.println(a.getState());
//			});
		
		List<User> ans3 = userrep.findDetails("Anushka", "Kolkata");
		ans3.forEach(a->{
			System.out.println(a);
			});
	}	
}
