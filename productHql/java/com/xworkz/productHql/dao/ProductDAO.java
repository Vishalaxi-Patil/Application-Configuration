package com.xworkz.productHql.dao;

import java.util.List;

import com.xworkz.productHql.entity.ProductEntity;
import com.xworkz.productHql.entity.ProductEntity.ProductType;

public interface ProductDAO {
	
	
	public void persist(ProductEntity entity);
	public ProductEntity findByNameAndManufacturer(String name, String manufacturer);
	public ProductEntity findByTypeAndBrandAndName(String name,ProductType type,String brand);
	public double findPriceBYTypeAndBrandAndName(ProductType type, String brand,String name);
	public Object[] findPriceAndQuantityByTypeAndBrandAndName(ProductType type,String name,String brand);
	public ProductEntity findBYTypeAndBrandAndQuality(String name, String brand, boolean quality);
	public Object[] findNameAndTypeById(int id);
	public int findMaxId();
	public long findSize();
	public double findMaxPrice();
	public double findSumPrice();
	public int findMinId();
	public List<ProductEntity> findDistinct();
	}
