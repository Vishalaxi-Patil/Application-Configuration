package com.xworkz.coupon.dao;

import java.util.List;

import com.xworkz.coupon.entity.CouponEntity;


public interface CouponDao {
	public void create(CouponEntity entity);
	public void deleteById(int id);
    public void updateNameAndValidity(int id,String name,int year);
    public CouponEntity getByid(int id);
    public void create(List<CouponEntity> entity);
    

}
