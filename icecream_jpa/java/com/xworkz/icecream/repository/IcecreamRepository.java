package com.xworkz.icecream.repository;

import java.util.List;

import com.xworkz.icecream.entity.IcecreamEntity;

public interface IcecreamRepository {
	public void persist(IcecreamEntity entity);
	public void deleteByName(String name);
	public void updatePriceByName(String name,double price);
	public List<IcecreamEntity> getAll();
	public IcecreamEntity findByNameAndPrice(String name, double price);
	public IcecreamEntity getByMaxPrice();
	public IcecreamEntity getByMinPrice();
	public double getBySumPrice();
	public double getPriceByName(String name);
	public List<Object[]> getNameAndFlavourByPrice(double price);
	
	
	
	

}
