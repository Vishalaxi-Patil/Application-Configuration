package com.xworkz.bbc.dao;

import com.xworkz.bbc.entity.BbcEntity;

public interface BbcDao {
	public void create(BbcEntity entity);
	
	public BbcEntity getById(int id);
	public BbcEntity updateNoOfTaskAndDaysInById(int id, int noOfTasks,int noOfdays);
	public void delete(int id);

}
