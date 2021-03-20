package com.xworkz.waterfall.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.waterfall.entity.WaterFallEntity;
import com.xworkz.waterfall.util.SFUtil;

public class SearchWaterFallDaoImpl extends WaterFallDaoImpl implements SearchWaterFallDao {
  SessionFactory factory=SFUtil.getFact();
	@Override
	public String findLocationByName(String name) {
		try(Session session=this.factory.openSession()){
		String hqlSyntax="select waterfall.location from WaterFallEntity waterfall "
				+ "where waterfall.name=:nm";
				Query<String> query=session.createQuery(hqlSyntax);
				query.setParameter("nm", name);
				return query.uniqueResult();
			
		}
		
		
	}

	@Override
	public int findNoOfDeathsByLocationAndName(String loc, String name) {
		try(Session session=this.factory.openSession()){
			String hqlSyntax="select waterfall.no_Of_Deaths from WaterFallEntity waterfall "
					+ "where waterfall.name=:nm and waterfall.location=:lc";
					Query<Integer> query=session.createQuery(hqlSyntax);
					query.setParameter("nm", name);
					query.setParameter("lc", loc);
					return	query.uniqueResult();
					
				
			}
		
	}

	@Override
	public Object[] findNoOfDeathsAndDestinationByLocationAndName(String loc, String name) {
		try(Session session=this.factory.openSession()){
			String hqlSyntax="select waterfall.no_Of_Deaths,waterfall.destination from "
					+ "WaterFallEntity waterfall where waterfall.name=:nm and "
					+ "waterfall.location=:lc";
					Query<Object[]> query=session.createQuery(hqlSyntax);
					query.setParameter("nm", name);
					query.setParameter("lc", loc);
					return	query.uniqueResult();
					
				
			}
	}


}
