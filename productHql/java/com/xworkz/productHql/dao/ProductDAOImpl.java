package com.xworkz.productHql.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.productHql.entity.ProductEntity;
import com.xworkz.productHql.entity.ProductEntity.ProductType;
import com.xworkz.utilJar.SFUtil;

public class ProductDAOImpl implements ProductDAO {

	private SessionFactory factory = SFUtil.getFact();

	@Override
	public void persist(ProductEntity entity) {
		System.out.println("Invoked persist");
		System.out.println("entity:" + entity);
		Transaction transaction = null;
		Session session = null;
		try {
			session = factory.openSession();

			transaction = session.beginTransaction();
			session.save(entity);
			int count = 0;
			count++;
			while (count == 5) {
				session.flush();
				System.out.println("Flushed");

			}

			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
		} finally {
			session.close();
		}

	}

	@Override
	public ProductEntity findByNameAndManufacturer(String name, String manufacturer) {
		System.out.println("invoked findByNameAndManufacturer");
		System.out.println("name" + name);
		System.out.println("manufacturer" + manufacturer);
		try (Session session = factory.openSession()) {
			String hqlSyntax = "Select products from ProductEntity products where products.name=:nm and products.manufacturer=:mn";
			Query<ProductEntity> result = session.createQuery(hqlSyntax);
			result.setParameter("nm", name);
			result.setParameter("mn", manufacturer);
			return result.uniqueResult();
		}

	}

	@Override
	public ProductEntity findByTypeAndBrandAndName(String name, ProductType type, String brand) {
		System.out.println("findByTypeAndBrandAndName");
		System.out.println("type:" + type);
		System.out.println("name:" + name);
		System.out.println("Brand:" + brand);
		try (Session session = factory.openSession()) {
			String hql = "select products from ProductEntity products where type=:ty and brand=:br and name=:nm";
			Query<ProductEntity> query = session.createQuery(hql);
			query.setParameter("ty", type);
			query.setParameter("nm", name);
			query.setParameter("br", brand);
			return query.uniqueResult();

		}

	}

	@Override
	public double findPriceBYTypeAndBrandAndName(ProductType type, String brand, String name) {
		System.out.println("type:" + type);
		System.out.println("Brand:" + brand);
		System.out.println("name:" + name);
		try (Session session = factory.openSession()) {
			String hqlQuery = "select products.price from ProductEntity products where type=:ty and brand=:br and name=:nm";
			Query<Double> results = session.createQuery(hqlQuery);
			results.setParameter("ty", type);
			results.setParameter("nm", name);
			results.setParameter("br", brand);
			return results.uniqueResult();

		}

	}

	@Override
	public Object[] findPriceAndQuantityByTypeAndBrandAndName(ProductType type, String name, String brand) {
		System.out.println("Invoked findPriceAndQuantityByTypeAndBrandAndName");
		System.out.println("ProductType:" + type);
		System.out.println("String:" + name);
		System.out.println("Type:" + type);
		System.out.println("brand:" + brand);
		try (Session session = factory.openSession()) {
			String hql = "select products.price,products.quantity from ProductEntity products where type=:ty and brand=:br and name=:nm";
			Query<Object[]> query = session.createQuery(hql);
			query.setParameter("ty", type);
			query.setParameter("nm", name);
			query.setParameter("br", brand);
			return query.uniqueResult();

		}

	}

	@Override
	public ProductEntity findBYTypeAndBrandAndQuality(String name, String brand, boolean quality) {
	 System.out.println("invoked findBYTypeAndBrandAndQuality");
		System.out.println("brand:" + brand);
		System.out.println("name:" + name);
		System.out.println("quality:" + quality);
		try(Session session=factory.openSession()){
			String hql="select products from ProductEntity products where quality=:qy and name=:nm and brand=:br";
			Query<ProductEntity> query=session.createQuery(hql);
			query.setParameter("qy", quality);
			query.setParameter("nm", name);
			query.setParameter("br", brand);
			return query.uniqueResult();

			
		}
		
	}

	@Override
	public Object[] findNameAndTypeById(int id) {
		System.out.println("Invoked findNameAndTypeById");
		System.out.println("id:"+id);
		try(Session session=factory.openSession()){
			String hql="select products.name,products.type from ProductEntity products where id=:id";
			Query<Object[]> query=session.createQuery(hql);
			query.setParameter("id",id);
			return query.uniqueResult();
			
		}
		
	}

	@Override
	public int findMaxId() {
		System.out.println("Invoked findMaxId");
		try(Session session=factory.openSession()){
			String hql="select max(products.id) from ProductEntity products";
			Query<Integer> query=session.createQuery(hql);
			return query.uniqueResult();
		}
		
	}

	@Override
	public long findSize() {
		System.out.println("invoked findSize");
		try(Session session=factory.openSession()){
			String hql="select count(products) from ProductEntity products";
			Query<Long> query=session.createQuery(hql);
			return query.uniqueResult();
		}
		
	}
	@Override
	public double findMaxPrice() {
		System.out.println("invoked findMaxPrice ");
		try(Session session=factory.openSession()){
			String hql="select max(products.price) from ProductEntity products";
			Query<Double> query=session.createQuery(hql);
			return query.uniqueResult();
		}
		
	}

	@Override
	public double findSumPrice() {
		System.out.println("invoked findSumPrice ");
		try(Session session=factory.openSession()){
			String hql="select sum(products.price) from ProductEntity products";
			Query<Double> query=session.createQuery(hql);
			return query.uniqueResult();
		}
	}

	@Override
	public int findMinId() {
		System.out.println("invoked findMinId ");
		try(Session session=factory.openSession()){
			String hql="select min(products.id) from ProductEntity products";
			Query<Integer> query=session.createQuery(hql);
			return query.uniqueResult();
		}
		
	}

	@Override
	public List<ProductEntity> findDistinct() {
		System.out.println("invoked findMinId ");
		try(Session session=factory.openSession()){
			String hql="select distinct products from ProductEntity products";
			Query<ProductEntity> query=session.createQuery(hql);
			return query.getResultList();
		}
		
	}//thread life cycle ways to create thread sync key word sync block, dead lock daemon thread, apache POI
}
