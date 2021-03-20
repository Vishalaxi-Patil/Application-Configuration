package com.xworkz.icecream.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.icecream.entity.IcecreamEntity;
import com.xworkz.util.EMUtil;

public class IcecreamRepoImpl implements IcecreamRepository {
	private EntityManagerFactory factory = EMUtil.getFact();

	@Override
	public void persist(IcecreamEntity entity) {
		System.out.println("invoked persist");
		EntityManager session = null;
		try {

			session = factory.createEntityManager();
			session.getTransaction().begin();
			session.persist(entity);
			session.getTransaction().commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}

	}

	@Override
	public void deleteByName(String name) {
		try {
			factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");

			EntityManager session = factory.createEntityManager();
			session.getTransaction().begin();
			javax.persistence.Query query = session.createNamedQuery("deleteByName");
			query.setParameter("nm", name);
			int result = query.executeUpdate();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updatePriceByName(String name, double price) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
			// EntityManager session=factory.
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public List<IcecreamEntity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IcecreamEntity findByNameAndPrice(String name, double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IcecreamEntity getByMaxPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IcecreamEntity getByMinPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getBySumPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPriceByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Object[]> getNameAndFlavourByPrice(double price) {
		// TODO Auto-generated method stub
		return null;
	}

}
