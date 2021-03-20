package com.xworkz.waterfall.dao;

import com.xworkz.waterfall.entity.WaterFallEntity;

public interface WaterFallDao {
	public void create(WaterFallEntity entity);
    public void deleteById(int id);
    public void updateHeightAndDepthById(int id,double height,double depth);
    public WaterFallEntity getByid(int id);
}
