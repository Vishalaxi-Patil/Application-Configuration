package com.xworkz.productHql;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.productHql.dao.ProductDAO;
import com.xworkz.productHql.dao.ProductDAOImpl;
import com.xworkz.productHql.entity.ProductEntity;
import com.xworkz.productHql.entity.ProductEntity.ProductType;

public class ProductTester {

	public static void main(String[] args) {

		ProductEntity entity = new ProductEntity("Refrigrator", "Shusma", "LG", 10000, ProductType.ELECTRONIC, 1, true);
		ProductEntity entity1 = new ProductEntity("Sandels", "Varun Foot wear", "Lunars", 300, ProductType.FASHION, 2,
				false);
		ProductEntity entity2 = new ProductEntity("Kurta", "More", "panttalos", 500, ProductType.COMPUTERS, 4,
				true);

		ProductEntity entity3 = new ProductEntity("Sandels", "Varun Foot wear", "Lunars", 300, ProductType.FASHION, 2,
				false);

		ProductEntity entity4 = new ProductEntity("Sandels", "Varun Foot wear", "Lunars", 300, ProductType.FASHION, 2,
				false);
		ProductEntity entity5 = new ProductEntity("Fan", "Nithoshva", "Usha", 2000, ProductType.HOME_APPLIANCES, 6,
				true);


		ProductDAO dao = new ProductDAOImpl();
		// dao.persist(entity);
		// dao.persist(entity1);
		//dao.persist(entity2);
		//dao.persist(entity3);
        //dao.persist(entity5);
		//ProductEntity find = dao.findByNameAndManufacturer("Refrigrator", "Shusma");
		// System.out.println(find);
		//ProductEntity find1 = dao.findByTypeAndBrandAndName("Sandels", ProductType.FASHION, "Lunars");
		// System.out.println(find1);
		//double prices = dao.findPriceBYTypeAndBrandAndName(ProductType.FASHION, "Lunars", "Sandels");
		// System.out.println(prices);
		//Object[] find2 = dao.findPriceAndQuantityByTypeAndBrandAndName(ProductType.ELECTRONIC, "Refrigrator", "LG");
		//System.out.println(find2.length);
		//System.out.println("price:"+find2[0]);
		//System.out.println("quantity:"+find2[1]);
		//ProductEntity find3=dao.findBYTypeAndBrandAndQuality("Refrigrator", "LG",true);
	//System.out.println(find3);
//		Object[] find4=dao.findNameAndTypeById(1);
//		System.out.println(find4[0]);
//		System.out.println(find4[1]);
//int find5=dao.findMaxId();	
//System.out.println(find5);
		//long sizes=dao.findSize();
		//System.out.println("size"+sizes);
//		double pric=dao.findMaxPrice();
//		System.out.println(pric);
		
//		double findSumPrice=dao.findSumPrice();
//		System.out.println("findSumPrice:"+findSumPrice);
//		int findMinId=dao.findMinId();
//		System.out.println("findMinId:"+findMinId);
		
		
		
		List<ProductEntity> findDistinct=dao.findDistinct();
		System.out.println("findDistinct:"+findDistinct);
		
	
	}

}
