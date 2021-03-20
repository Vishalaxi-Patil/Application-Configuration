package com.xworkz.services;

import com.xworkz.dao.LeaveDAO;
import com.xworkz.dao.LeaveDAOImpl;
import com.xworkz.entity.LeaveEntity;

public class LeaveServiceImpl implements LeaveService<LeaveEntity> {
	
	private LeaveDAO dao;
	
	public LeaveServiceImpl() {
		System.out.println("created Serive");
		dao=new LeaveDAOImpl();
	}

	@Override
	public boolean validateAndSave(LeaveEntity entity) {
		System.out.println("Invoked validateAndSave");
		System.out.println("entity :"+entity);
		boolean valid=true;
		if(entity!=null) {
			System.out.println("entity is not null so,validate the all fileds");
			if(valid) {
				String name=entity.getName();
				if(name!=null && !name.isEmpty() && name.length()>1 && name.length()<10) {
					System.out.println("name is valid");
					valid=true;
				}else {
					System.out.println("name is not valid");
					valid=false;
				}
			}
			if(valid) {
				String email=entity.getEmail();
				if(email!=null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")) {
					System.out.println("email is valid");
					valid=true;
				}else {
					System.out.println("email is not valid");
					valid=false;
				}
			}
			if(valid) {
				String reason=entity.getReason();
				if(reason!=null && !reason.isEmpty() && reason.length()>3 && reason.length()<=300) {
					System.out.println("reason is valid");
					valid=true;
				}else {
					System.out.println("reason is not valid");
					valid=false;
				}
			}
			if(valid) {
				String date=entity.getDate();
				if(date!=null && !date.isEmpty() && date.length()>3 && date.length()<=300) {
					System.out.println("date is valid");
					valid=true;
				}else {
					System.out.println("date is not valid");
					valid=false;
				}
			}
			if(valid) {
				String no=entity.getNo();
				if(no!=null && !no.isEmpty() && no.length()>1 && no.length()<=10) {
					System.out.println("no is valid");
					valid=true;
				}else {
					System.out.println("no is not valid");
					valid=false;
				}
			}
			
			
			
		}else {
			System.out.println("entity is null");
		}
		if(valid) {
			this.dao.save(entity);
			System.out.println("save whole entity");
			
			}else {
				System.out.println("entity failed to save");
			}
		return valid;
		
	}
	

}
