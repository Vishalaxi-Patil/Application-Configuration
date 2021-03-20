package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.ShortFilmDao;
import com.xworkz.waterfall.dao.ShortFilmDaoImpl;
import com.xworkz.waterfall.entity.ShortFilmEntity;

public class ShortFilmTester {

	public static void main(String[] args) {
		ShortFilmEntity entity=new ShortFilmEntity();
		entity.setSid(1);
		entity.setName("SoftwareDevloveper");
		entity.setActor("shannu");
		entity.setBudget(6000000.0);
		entity.setForgien_shouting(false);
		entity.setLanguage("telgu");
		entity.setRatings(8);
		
		ShortFilmEntity entity1=new ShortFilmEntity();
		//entity1.setSid(2);
		entity1.setName("summer story");
		entity1.setActor("Jemini");
		entity1.setBudget(0.0);
		entity1.setForgien_shouting(false);
		entity1.setLanguage("hindi");
		entity1.setRatings(6);
		
   ShortFilmDao dao=new ShortFilmDaoImpl();
   //dao.create(entity);
  // dao.create(entity1);
  // dao.deleteById(2);
   dao.getByid(1);
	}

}
