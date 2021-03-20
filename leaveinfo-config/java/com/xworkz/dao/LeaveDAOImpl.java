package com.xworkz.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.mysql.cj.Session;
import com.xworkz.entity.LeaveEntity;

public class LeaveDAOImpl implements LeaveDAO {
	

	public LeaveDAOImpl() {
		System.out.println("Invoked :" + this.getClass().getSimpleName());
	}

	public void save(LeaveEntity entity) {
		EntityManager session = null;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		try {
			session = factory.createEntityManager();
			session.getTransaction().begin();
			session.persist(entity);
			session.getTransaction().commit();

		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
			factory.close();
		}

	}
}
