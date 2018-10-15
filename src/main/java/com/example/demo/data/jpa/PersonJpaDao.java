package com.example.demo.data.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.data.entity.Person;

@Repository
@Transactional
public class PersonJpaDao {
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	 
	public List<Person> findAll(){
		TypedQuery<Person> query = entityManager.createNamedQuery("Find_All",Person.class);
		return query.getResultList();
	}
	
	public Person findById(int Id){
		return entityManager.find(Person.class,Id);
	}
	

}
