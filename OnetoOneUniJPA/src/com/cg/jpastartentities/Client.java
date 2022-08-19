package com.cg.jpastartentities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		Student student=new Student();
		student.setName("Ras");
		
		Address homeAddress=new Address();
		homeAddress.setStreet("Nepal");
		homeAddress.setCity("Kathmandu");
		homeAddress.setState("Bagmati");
		homeAddress.setZipcode("45343");
		
		student.setAddress(homeAddress);
		em.persist(student);
		em.getTransaction().commit();
		em.close();
		factory.close();
		

	}

}
