package com.xworkz.coupon;
import java.util.ArrayList;
import java.util.List;
import com.xworkz.coupon.dao.CouponDao;
import com.xworkz.coupon.dao.CouponDaoImpl;
import com.xworkz.coupon.entity.CouponEntity;

public class CouponTester {

	public static void main(String[] args) {
		CouponEntity entity=new CouponEntity();
		entity.setCid(1);
		entity.setName("supermarket_Coupon");
		entity.setCode("Super#123");
		entity.setTypeOfCode("shopping groceries");
		entity.setValidateDate(2 );
		
		CouponEntity entity1=new CouponEntity();
		entity1.setCid(2);
		entity1.setName("Hotel_Coupon");
		entity1.setCode("food#123");
		entity1.setTypeOfCode("food");
		entity1.setValidateDate(3);
		
		
		CouponDao dao=new CouponDaoImpl();
		//dao.create(entity);
		//dao.create(entity1);
		//dao.deleteById(1);
		//dao.updateNameAndValidity(2, "Resturant",3);
		//dao.getByid(2);
		List<CouponEntity> list=new ArrayList<CouponEntity>();
		CouponEntity add=new CouponEntity();
		add.setCid(4);
		add.setName("mallCoupon");
		add.setTypeOfCode("cloths");
		add.setCode("orion#1232");
		add.setValidateDate(5);
		

		CouponEntity add1=new CouponEntity();
		add1.setCid(5);
		add1.setName("NykaCoupon");
		add1.setTypeOfCode("cosmetics");
		add1.setCode("Nyka#13332");
		add1.setValidateDate(3);
		
		
		CouponEntity add2=new CouponEntity();
		add2.setCid(6);
		add2.setName("bigbaskate");
		add2.setTypeOfCode("vegitable");
		add2.setCode("Bigbasket#13332");
		add2.setValidateDate(1);
		
		CouponEntity add3=new CouponEntity();
		add3.setCid(7);
		add3.setName("Swiggy");
		add3.setTypeOfCode("meals");
		add3.setCode("Swiggy#25332");
		add3.setValidateDate(2);
		list.add(add1);
		list.add(add2);
		list.add(add3);
		list.add(add1);
		
   dao.create(list);
		

	}

}
