package com.xworkz.coupon.dao;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.xworkz.coupon.entity.CouponEntity;
import com.xworkz.utilJar.SFUtil;



public class CouponDaoImpl implements CouponDao {
	private SessionFactory factory=SFUtil.getFact();

	@Override
	public void create(CouponEntity entity) {
		System.out.println("created coupon entity");
		System.out.println("entity"+entity);
		try(Session session=factory.openSession()){
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			}	

		}

	@Override
	public void deleteById(int id) {
		try(Session session=factory.openSession()){
			Transaction transaction=session.beginTransaction();
			CouponEntity entittyFromDb=session.get(CouponEntity.class, id);
			if(entittyFromDb!=null) {
				session.delete(entittyFromDb);
				transaction.commit();
			}
			
		}
		
	}

	@Override
	public void updateNameAndValidity(int id, String name, int year) {
		try(Session session=factory.openSession()){
			Transaction transaction=session.beginTransaction();
			CouponEntity entittyFromDb=session.get(CouponEntity.class, id);
			if(entittyFromDb!=null) {
				entittyFromDb.setName(name);
				entittyFromDb.setValidateDate(year);
				session.update(entittyFromDb);
				transaction.commit();
			}
		
		}
	}

	@Override
	public CouponEntity getByid(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		CouponEntity entityFromDb=session.get(CouponEntity.class, id);
		transaction.commit();
		return entityFromDb;
	}

	@Override
	public void create(List<CouponEntity> entity) {
		System.out.println("invoked create");
		System.out.println("entity" + entity);

		try {
			Session session = factory.openSession();
			int count=0;
			Transaction transaction = session.beginTransaction();
			for (CouponEntity couponEntity : entity) {		
				session.save(couponEntity);
					count++;
					if(count==5) {
						session.flush();
						count=0;
						System.out.println("flush is used");
					}
					

			}
			
		
			transaction.commit();
			session.close();

		} catch (HibernateException e) {
			e.printStackTrace();

		}

		
	}
	}


	

