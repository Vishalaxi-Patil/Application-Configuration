package com.xworkz.bbc;

import com.xworkz.bbc.dao.BbcDao;
import com.xworkz.bbc.dao.BbcDaoImpl;
import com.xworkz.bbc.entity.BbcEntity;

public class UpdateTaskDaysTester {

	public static void main(String[] args) {
		BbcEntity entity=new BbcDaoImpl().updateNoOfTaskAndDaysInById(2, 2, 2);
		System.out.println(entity);

	}

}
