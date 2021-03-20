package com.xworkz.waterfall;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.waterfall.dao.ShortFilmDao;
import com.xworkz.waterfall.dao.ShortFilmDaoImpl;
import com.xworkz.waterfall.entity.ShortFilmEntity;
import com.xworkz.waterfall.util.ShortFilmUtil;

public class ShortFilmListTester {

	public static void main(String[] args) {
		List<ShortFilmEntity> list=new ArrayList<ShortFilmEntity>();
		ShortFilmEntity entity=new ShortFilmEntity("ondu motteya kathe","kannada","raj b shetty",7,100000.0,false);
		ShortFilmEntity entity1=new ShortFilmEntity("amrutanjan","kannada","hero",8,20000.0,true);
		ShortFilmEntity entity2=new ShortFilmEntity("Imdad","hindi","master",9,20000.0,true);
		ShortFilmEntity entity3=new ShortFilmEntity("my gf is an alien","chiniase","hsu tussak",9,20000.0,true);
		ShortFilmEntity entity4=new ShortFilmEntity("Engineering girls","hindi","bhakra singh",7,300000.0,false);
		
		
		list.add(entity1);
		list.add(entity2);
		list.add(entity3);
		list.add(entity4);
	
		ShortFilmDao dao=new ShortFilmDaoImpl();
		dao.create(list);
		
		
		
		
	 
		
	
		

	}

}
