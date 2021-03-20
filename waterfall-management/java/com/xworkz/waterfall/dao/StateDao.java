package com.xworkz.waterfall.dao;

import java.util.List;

import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.entity.WaterFallEntity;

public interface StateDao {
	public void create(List<StateEntity> entity);
	public void create(WaterFallEntity entity,StateEntity entity1);
	public List<StateEntity> findAll();
	public List<Integer> findAllIds();
	public List<Object[]> findAllIdAndName();
	public void updatePopulationByName(String name, double population);
	public StateEntity findById(int id);

}
