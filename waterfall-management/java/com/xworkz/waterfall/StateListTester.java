package com.xworkz.waterfall;

import java.util.List;

import com.xworkz.waterfall.dao.StateDao;
import com.xworkz.waterfall.dao.StateDaoImpl;
import com.xworkz.waterfall.entity.StateEntity;

public class StateListTester {

	public static void main(String[] args) {
		StateDao dao=new StateDaoImpl();
		//List<StateEntity> lists=dao.findAll();
		//System.out.println(lists);
		// List<Integer> ids=dao.findAllIds();
		// System.out.println(ids);
		//List<Object[]> listOfIdAndName=dao.findAllIdAndName();
		//System.out.println(listOfIdAndName);
		//dao.updatePopulationByName("karnataka", 8.0);
		StateEntity entity=dao.findById(1);
		System.out.println(entity);
		

	}

}
