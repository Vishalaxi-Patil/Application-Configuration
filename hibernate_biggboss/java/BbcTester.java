import com.xworkz.bbc.dao.BbcDao;
import com.xworkz.bbc.dao.BbcDaoImpl;
import com.xworkz.bbc.entity.BbcEntity;

public class BbcTester {

	public static void main(String[] args) {
		BbcEntity entity=new BbcEntity();
		//entity.setId(1);
		entity.setName("Bro gowda");
		entity.setType("Tiktoker");
		entity.setGender("gender");
		entity.setNoOfDays(1);
		entity.setNoOfTasks(0);
		entity.setSeason(8);
		
		
		BbcDao dao=new BbcDaoImpl();
		dao.create(entity);
		
		
		
		
		
		
		
		
		

	}

}
