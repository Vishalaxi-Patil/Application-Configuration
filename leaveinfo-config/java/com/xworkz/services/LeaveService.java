package com.xworkz.services;

import com.xworkz.entity.LeaveEntity;

public interface LeaveService<T> {
	
	public boolean validateAndSave(LeaveEntity entity);

}
