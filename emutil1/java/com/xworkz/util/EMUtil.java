package com.xworkz.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	private static EntityManagerFactory factory;

	public static EntityManagerFactory getFactory() {
		return factory;
	}

	static {
		try {
			factory = Persistence.createEntityManagerFactory("com.xworkz_interior.jpa");
			if (factory != null) {
				System.out.println("EMUtil created sucessfully");
			} else {
				throw new ManagerException("EMUtil not created");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
