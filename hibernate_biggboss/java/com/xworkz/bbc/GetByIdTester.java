package com.xworkz.bbc;

import com.xworkz.bbc.dao.BbcDao;
import com.xworkz.bbc.dao.BbcDaoImpl;
import com.xworkz.bbc.entity.BbcEntity;

public class GetByIdTester {

	public static void main(String[] args) {
		BbcDao dao=new BbcDaoImpl();
		BbcEntity entity1=dao.getById(2);
		System.out.println(entity1.getName());
		System.out.println(entity1);

	}

}
