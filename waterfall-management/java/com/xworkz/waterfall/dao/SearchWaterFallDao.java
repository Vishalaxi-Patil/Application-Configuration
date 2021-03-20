package com.xworkz.waterfall.dao;

public interface SearchWaterFallDao extends WaterFallDao {
	public String findLocationByName(String name);
	public int findNoOfDeathsByLocationAndName(String loc,String name);
	public Object[] findNoOfDeathsAndDestinationByLocationAndName(String loc,String name);

}
