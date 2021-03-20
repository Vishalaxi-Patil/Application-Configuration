package com.xworkz.waterfall;
import java.util.ArrayList;
import java.util.List;
import com.xworkz.waterfall.dao.StateDao;
import com.xworkz.waterfall.dao.StateDaoImpl;
import com.xworkz.waterfall.entity.StateEntity;



public class StateTeaster {
	public static void main(String[] args) {
		
	
	List<StateEntity> list=new ArrayList<StateEntity>();
	
	StateEntity state=new StateEntity("karnataka", 70000.0,32,"kannada");
	StateEntity state1=new StateEntity("goa", 10000.0,10,"konkani");
	StateEntity state2=new StateEntity("Telangana", 50000.0,30,"telgu");
    StateEntity state3=new StateEntity("maharastra", 10000.0, 29, "marati");
    StateEntity state4=new StateEntity("bihar", 50000.0,30,"bihari");
    StateEntity state5=new StateEntity("tamilnadu", 70000.0,36,"tamil");
    list.add(state);
    list.add(state1);
    list.add(state2);
    list.add(state3);
    list.add(state4);
    list.add(state5);
    
    
   /* WaterFallEntity entitye=new WaterFallEntity();
    entitye.setId(1);
    entitye.setDepth(1234.0);
    entitye.setDestination("ocean");
    entitye.setElectricity(true);
    entitye.setEntry_fees(100.0);
    entitye.setHeight(123.0);
    entitye.setId(4);
    entitye.setNo_Of_Deaths(100);
    entitye.setNo_Of_Visitors(2000);
    entitye.setSource_River("kaali");
    entitye.setRating(5.0);
    entitye.setLocation("dandeli");
    entitye.setName("kaali");
 
    dao.create(entitye, state1);*/
    StateDao dao=new StateDaoImpl();
    dao.create(list);
    
	

}
}
