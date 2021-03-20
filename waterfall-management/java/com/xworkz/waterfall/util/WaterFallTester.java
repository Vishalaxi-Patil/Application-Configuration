package com.xworkz.waterfall.util;

import org.hibernate.SessionFactory;

import com.xworkz.waterfall.dao.WaterFallDao;
import com.xworkz.waterfall.dao.WaterFallDaoImpl;
import com.xworkz.waterfall.entity.WaterFallEntity;

public class WaterFallTester {

	public static void main(String[] args) {
		//System.out.println(factory);
		
		
		WaterFallEntity entity=new WaterFallEntity();
		//entity.setId(1);
		entity.setName("Jog Fallas");
		entity.setLocation("shivmogga");
		entity.setDepth(14.0);
		entity.setDestination("Ocean");
		entity.setElectricity(true);
		entity.setEntry_fees(50.0);
		entity.setHeight(123.0);
		entity.setNo_Of_Deaths(200);
		entity.setNo_Of_Visitors(5000000);
		entity.setRating(5.0);
		entity.setSource_River("malaprabha");
		
		
		WaterFallDao dao=new WaterFallDaoImpl();
		dao.create(entity);
		
		
		
		WaterFallEntity entity1=new WaterFallEntity();
		//entity1.setId(2);
		entity1.setName("DudhSagar Fallas");
		entity1.setLocation("goa");
		entity1.setDepth(27.0);
		entity1.setDestination("Ocean");
		entity1.setElectricity(false);
		entity1.setEntry_fees(100.0);
		entity1.setHeight(42.0);
		entity1.setNo_Of_Deaths(500);
		entity1.setNo_Of_Visitors(2000000);
		entity1.setRating(10.0);
		entity1.setSource_River("kaali");
		dao.create(entity1);
		
		
		dao.deleteById(1);
		dao.updateHeightAndDepthById(2, 52.0, 37.0);
		dao.getByid(2);

	}

}
