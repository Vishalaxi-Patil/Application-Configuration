package com.xworkz.bbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="biggboss")

public class BbcEntity {
	@Id
	@GenericGenerator(name="auto" , strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name= "ID")
	private int id;
	@Column(name= "NAME")
	private String name;
	@Column(name= "SEASON")
	private int season ;
	@Column(name= "TYPE")
	private String type;
	@Column(name= "NO_OF_DAYS")
	private int noOfDays;
	@Column(name= "GENDER")
	private String gender;
	@Column(name= "NO_OF_TASKS")
	private int noOfTasks;
	
	
	
	
	

}
