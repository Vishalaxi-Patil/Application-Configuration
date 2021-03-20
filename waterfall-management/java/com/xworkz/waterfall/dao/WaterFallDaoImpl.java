package com.xworkz.waterfall.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.WaterFallEntity;
import com.xworkz.waterfall.util.SFUtil;

public class WaterFallDaoImpl implements WaterFallDao {
	private SessionFactory fact=SFUtil.getFact();
	
	 public WaterFallDaoImpl() {
		 System.out.println("created"+this.getClass());
		
	}

	@Override
	public void create(WaterFallEntity entity) {
		System.out.println("invoked create");
		System.out.println("entity"+entity);
		
		try(Session session = fact.openSession()){
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			
		}
		

	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked delete by id");
		try(Session session=fact.openSession()){
			Transaction transaction=session.beginTransaction();
			WaterFallEntity entityFromDb=session.get(WaterFallEntity.class, 1);
			if(entityFromDb!=null) {
				session.delete(entityFromDb);
				transaction.commit();
			}
			
		}
		
	}

	@Override
	public void updateHeightAndDepthById(int id, double height, double depth) {
		System.out.println("invoked update by height and depth by id");
		try(Session session=fact.openSession()){
			Transaction transaction=session.beginTransaction();
			WaterFallEntity entityFromDb=session.get(WaterFallEntity.class, id);
			if(entityFromDb!=null) {
				entityFromDb.setHeight(height);
				entityFromDb.setDepth(depth);
				session.update(entityFromDb);
				transaction.commit();
			}
		}
		
	}

	@Override
	public WaterFallEntity getByid(int id) {
		System.out.println("invoked get by id");
		Session session=fact.openSession();
		Transaction transaction=session.beginTransaction();
		WaterFallEntity entityFromDb=session.get(WaterFallEntity.class, id);
		transaction.commit();
		return entityFromDb;
	}

}
