package com.xworkz.coupon;

import com.xworkz.coupon.dao.CartoonDao;
import com.xworkz.coupon.dao.CartoonDaoImpl;
import com.xworkz.coupon.entity.CartoonEntity;
import com.xworkz.coupon.entity.CartoonEntity.Channel;

public class KavitaHQLTester {
	
	public static void main(String[] args) {
		
		CartoonDao cartoonDao=new CartoonDaoImpl();
		CartoonEntity entityFromDb=cartoonDao.findByName("Jerry");
		System.out.println(entityFromDb);
		CartoonEntity entity1=cartoonDao.findByChannelAndLanguage(Channel.HUNGMA, "Eng");
		System.out.println(entity1);
		
	}

}
