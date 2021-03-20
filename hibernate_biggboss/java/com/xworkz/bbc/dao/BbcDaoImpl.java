package com.xworkz.bbc.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bbc.entity.BbcEntity;

public class BbcDaoImpl implements BbcDao {

	@Override
	public void create(BbcEntity entity) {
		System.out.println("invoked create");
		System.out.println("entity" + entity);

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BbcEntity.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Override
	public BbcEntity getById(int id) {
		System.out.println("id" + id);
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BbcEntity.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tranaction = session.beginTransaction();
		BbcEntity entity = session.get(BbcEntity.class, id);
		tranaction.commit();
		session.close();
		sessionFactory.close();
		return entity;

	}

	@Override
	public BbcEntity updateNoOfTaskAndDaysInById(int id, int noOfTasks, int noOfdays) {
		System.out.println("created  updateNoOfTaskAndDaysInById");
		SessionFactory sessionfactory=new Configuration().configure().addAnnotatedClass(BbcEntity.class).buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		BbcEntity entityFromDb=session.get(BbcEntity.class, id);
		if(entityFromDb !=null) {
			System.out.println("you can update the entity"+id);	
			entityFromDb.setNoOfTasks(noOfTasks);
			entityFromDb.setNoOfDays(noOfdays);
			transaction.commit();
			sessionfactory.close();
		}
		else {
			System.out.println("There is no update");
		}
		
		
		
		return entityFromDb;
	}

	@Override
	public void delete(int id) {
		System.out.println("invoked delete");
		SessionFactory sessionfactory=new Configuration().configure().addAnnotatedClass(BbcEntity.class).buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		BbcEntity entityFromDb=session.get(BbcEntity.class, id);
		if(entityFromDb !=null) {
			System.out.println("you can delete the entity"+id);	
			session.delete(entityFromDb);
			transaction.commit();
			sessionfactory.close();
			session.close();
		
		
	}else {
		System.out.println("Entity is not deleted");
	}

}
}