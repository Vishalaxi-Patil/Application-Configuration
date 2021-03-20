package com.xworkz.waterfall.dao;

import java.util.List;

import javax.transaction.Synchronization;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.entity.WaterFallEntity;
import com.xworkz.waterfall.util.StateUtil;

public class StateDaoImpl implements StateDao {
	private SessionFactory fact = StateUtil.getFact();

	/*
	 * public StateDaoImpl() { System.out.println("created" + this.getClass());
	 * 
	 * }
	 */

	@Override
	public void create(List<StateEntity> entity) {
		System.out.println("invoked create");
		System.out.println("entity" + entity);

		try {
			Session session = fact.openSession();
			int count = 0;
			Transaction transaction = session.beginTransaction();
			for (StateEntity stateEntity : entity) {
				session.save(stateEntity);
				count++;
				if (count == 5) {
					session.flush();
					count = 0;
					System.out.println("flush is used");
				}

			}

			transaction.commit();
			session.close();

		} catch (HibernateException e) {
			e.printStackTrace();

		}

	}

	@Override
	public void create(WaterFallEntity entity, StateEntity entity1) {
		Transaction tr = null;
		System.out.println("entity" + entity + "entity1" + entity1);

		try (Session session = fact.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			session.flush();
			session.save(entity1);

			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();

		}

	}

	@Override
	public List<StateEntity> findAll() {
		System.out.println("invoked findAll");
		try (Session session = this.fact.openSession()) {
			Query<StateEntity> query = session.createNamedQuery("findAll");
			List<StateEntity> list = query.list();
			return list;

		}

	}

	@Override
	public List<Integer> findAllIds() {
		System.out.println("invoked findAllIds");
		try (Session session = this.fact.openSession()) {
			Query<Integer> query = session.createNamedQuery("findAllIds");
			List<Integer> list = query.list();
			return list;
		}
	}

	@Override
	public List<Object[]> findAllIdAndName() {
		System.out.println("invoked findAllIdand name");
		try (Session session = this.fact.openSession()) {
			Query<Object[]> query = session.createNamedQuery("findAllIdAndName");
			List<Object[]> list = query.list();
			return list;
		}
	}

	@Override
	public void updatePopulationByName(String name, double population) {
		System.out.println("invoked updatePopulationByName");
		System.out.println("name" + name);
		System.out.println("population" + population);
		Transaction transaction = null;
		try (Session session = fact.openSession()) {
			transaction = session.beginTransaction();
			Query<Double> query = session.createNamedQuery("updatePopulationByName");
			query.setParameter("nm", name);
			query.setParameter("po", population);
			query.executeUpdate();
			session.getTransaction().commit();

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}

	@Override
	public StateEntity findById(int id) {
		System.out.println("Invoked findById");
		//sSystem.out.println(this.find);
		System.out.println("id:"+id);
		try(Session session=fact.openSession()){
			System.out.println("=====GET LOAD=======");
			StateEntity query=session.load(StateEntity.class, id);
			System.out.println(query);
            System.out.println("=====GET LOAD=======");
            return query;
		}
		
	}

}
