package com.xworkz.icecream;

import com.xworkz.icecream.entity.IcecreamEntity;
import com.xworkz.icecream.entity.IcecreamEntity.Colour;
import com.xworkz.icecream.entity.IcecreamEntity.Flavour;
import com.xworkz.icecream.repository.IcecreamRepoImpl;
import com.xworkz.icecream.repository.IcecreamRepository;

public class IceCreamTester {

	public static void main(String[] args) {
		
		IcecreamEntity entity=new IcecreamEntity(2,"chocobar", Flavour.CHOCOLATE, Colour.BROWN, 15);
		IcecreamRepository repo=new IcecreamRepoImpl();
		repo.persist(entity);
		//repo.deleteByName("chocobar");
		
		


	}

}
