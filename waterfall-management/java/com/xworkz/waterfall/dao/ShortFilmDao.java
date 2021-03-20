package com.xworkz.waterfall.dao;

import java.util.List;

import com.xworkz.waterfall.entity.ShortFilmEntity;
import com.xworkz.waterfall.entity.StateEntity;

public interface ShortFilmDao {
	public void create(ShortFilmEntity entity);
    public void deleteById(int id);
    public void updateByBudgetAndLanguage(int id,double budget,String language);
    public ShortFilmEntity getByid(int id);
    public void create(List<ShortFilmEntity> entity);
    public ShortFilmEntity getAllFilms(List<ShortFilmEntity> entity);

}
