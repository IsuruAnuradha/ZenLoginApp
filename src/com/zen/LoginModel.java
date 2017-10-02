package com.zen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LoginModel {

	public String getType(String login, String paswd) {
		
		System.out.println(login + "  " +  paswd); 
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("CutomerEntity");
		EntityManager em = emf.createEntityManager();
		
		CustomerEntity ce = em.find(CustomerEntity.class, login);
		
		System.out.println(ce);
	
		return null;
	}

}
