package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.StateDao;
import com.xworkz.waterfall.dao.StateDaoImpl;
import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.entity.WaterFallEntity;

public class StateWaterTester {

	public static void main(String[] args) {
		 WaterFallEntity entitye=new WaterFallEntity();
		    entitye.setId(80);
		    entitye.setDepth(2234.0);
		    entitye.setDestination("ocean");
		    entitye.setElectricity(true);
		    entitye.setEntry_fees(300.0);
		    entitye.setHeight(144.0);
		    entitye.setNo_Of_Deaths(400);
		    entitye.setNo_Of_Visitors(4000);
		    entitye.setSource_River("arabbi");
		    entitye.setRating(5.0);
		    entitye.setLocation("kodagu");
		    entitye.setName("abbi");
		    
		    
		    //StateEntity state=new StateEntity("rajastan", 8000.0,40,"rajastani");
			StateEntity state1=new StateEntity("andra", 20000.0,39,"telgu");
		    StateDao dao=new StateDaoImpl();
		    dao.create(entitye, state1);

	}

}
