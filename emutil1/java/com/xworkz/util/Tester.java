package com.xworkz.util;

import javax.persistence.EntityManagerFactory;

import org.hibernate.jpa.HibernatePersistenceProvider;

public class Tester {
	
	

	public static void main(String[] args) {

		EntityManagerFactory factory=EMUtil.getFactory();
		System.out.println(factory);
	}

}
