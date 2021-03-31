package com.project.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.main.model.Person;

public interface UserDao extends JpaRepository<com.project.main.model.Person, Integer>{
	
	@Query("select u from Person u where u.id=:id")
	public Person findUserById(@Param("id") Integer id);

	@Query("Select u from Person u where u.fName Like '%'||:fname||'%'")
	public List<Person> getUserByfname(@Param("fname") String fname);
}
