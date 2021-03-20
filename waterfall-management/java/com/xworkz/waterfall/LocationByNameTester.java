package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.SearchWaterFallDao;
import com.xworkz.waterfall.dao.SearchWaterFallDaoImpl;

public class LocationByNameTester {

	public static void main(String[] args) {
		SearchWaterFallDao dao= new SearchWaterFallDaoImpl();
		//String result=dao.findLocationByName("abbi");
		//System.out.println(result);
		//int noofdeaths=dao.findNoOfDeathsByLocationAndName("kodagu", "abbi");
        //System.out.println(noofdeaths);
	Object[] resultOfArray=dao.findNoOfDeathsAndDestinationByLocationAndName("kodagu", "abbi");
	System.out.println(resultOfArray.length);
	System.out.println(resultOfArray[0]);
	System.out.println(resultOfArray[1]);
	}

}
