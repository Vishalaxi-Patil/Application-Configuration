package com.xworkz.waterfall.entity;

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
@Table(name="water_fall")

public class WaterFallEntity {
	@Id
	@Column(name= "WID")
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator  = "auto")
	private int id;
	
	

	@Column(name= "NAME")
	private String name;
	
	@Column(name= "LOCATION")
	private String location;
	

	@Column(name= "HEIGHT")
	private double height;
	

	@Column(name= "DEPTH")
	private double depth;
	

	@Column(name= "ELECTRICITY_GENERATED")
	private boolean electricity;
	

	@Column(name= "SOURCE_RIVER")
	private String source_River;
	

	@Column(name= "ENTRY_FEES")
	private double entry_fees;
	

	@Column(name= "DESTINATION")
	private String destination;
	

	@Column(name= "RATING")
	private double rating;
	
	@Column(name= "NO_OF_DEATHS")
	private int no_Of_Deaths;
	
	@Column(name= "NO_OF_VISITORS")
	private int no_Of_Visitors;
	
	
	
	

}
