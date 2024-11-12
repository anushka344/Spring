package com.jpa.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findByNameAndCity(String name,String city);
	
	@Query("select u from User u")
	public List<User> getallUsers();
	
	@Query("select u from User u where u.name =:n and u.city =:c")
	public List<User> findDetails(@Param("n") String name , @Param("c") String city);
	
}
