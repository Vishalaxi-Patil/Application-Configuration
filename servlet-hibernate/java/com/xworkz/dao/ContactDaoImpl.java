package com.xworkz.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.entity.ContactForm;
import com.xworkz.util.EMUtil;

public class ContactDaoImpl implements ContactFormDao {

	@Override
	public void save(ContactForm entity) {
		System.out.println("invoked create method");
		System.out.println("entity:"+entity);

		//EntityManager session = null;
		
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz_interior.jpa");
		EntityManager session = factory.createEntityManager();
			session.getTransaction().begin();
			session.persist(entity);
			session.getTransaction().commit();
			session.close();
			
		

		} 
		
	


	}
		
		
	