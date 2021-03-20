package com.xworkz.waterfall.dao;


import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.ShortFilmEntity;
import com.xworkz.waterfall.util.ShortFilmUtil;

public class ShortFilmDaoImpl implements ShortFilmDao {
	private SessionFactory factory=ShortFilmUtil.getFact();
	

	@Override
	public void create(ShortFilmEntity entity) {
		System.out.println("invoked create");
		System.out.println("entity"+entity);
		try(Session session=factory.openSession()){
		Transaction transaction=session.beginTransaction();
		session.save(entity);
		transaction.commit();
		}	

	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked delete");
		System.out.println("id"+id);
		try(Session session=factory.openSession()){
			Transaction transaction=session.beginTransaction();
			ShortFilmEntity entityFromdb=session.get(ShortFilmEntity.class, 2);
			session.delete(entityFromdb);
			transaction.commit();
		

	}
	}
	@Override
	public void updateByBudgetAndLanguage(int id, double budget, String language) {
		try(Session session=factory.openSession()){
			Transaction transaction=session.beginTransaction();
			ShortFilmEntity entityfrmdb=session.get(ShortFilmEntity.class, 1);
			if(entityfrmdb!=null) {
				entityfrmdb.setBudget(3000000.0);
				entityfrmdb.setLanguage("kannada");
				session.update(entityfrmdb);
				transaction.commit();
			}
		}

	}

	@Override
	public ShortFilmEntity getByid(int id) {
		System.out.println("invoked get by id");
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		ShortFilmEntity entityFromDb=session.get(ShortFilmEntity.class, id);
		transaction.commit();
		return entityFromDb;
	}

	@Override
	public void create(List<ShortFilmEntity> entity) {
		System.out.println("invoked create of list");
		System.out.println("entity"+entity);
		try {
			Session session=factory.openSession();
			int count=0;
			Transaction tr=session.beginTransaction();
			for (ShortFilmEntity shortFilmEntity : entity) {
				session.save(shortFilmEntity);
			   count++;
			   if(count==5) {
				   session.flush();
				   count=0;
				   System.out.println("flush is used");
			   }
			}tr.commit();
			session.close();
		}
	
			
			catch (HibernateException e) {
				e.printStackTrace();
			}
				
			
			
			
		
		
	}
	
    

	@Override
	public ShortFilmEntity getAllFilms(List<ShortFilmEntity> entity) {
	
		return null;
	}
	

}
