package com.xworkz.waterfall.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="short_films")
public class ShortFilmEntity {
	@Id
	@Column(name= "SID")
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator  = "auto")

	
	private int sid;
	@Column(name="NAME")
	private String name;
	@Column(name="LANGUAGE")
	private String language;
	
	@Column(name="ACTOR")
	private String actor;
	
	
	@Column(name="RATINGS")
	private int ratings;
	
	@Column(name="BUDJET")
	private double budget;
	
	@Column(name="FORGIEN_SHOUTING")
	private boolean forgien_shouting;
	
	
	public ShortFilmEntity( String name,String language,String actor,int ratings, double budget,boolean forgien_shouting) {
		this.actor=actor;
		this.budget=budget;
		this.forgien_shouting=forgien_shouting;
		this.language=language;
		this.name=name;
		this.ratings=ratings;

	}
	
	

}
