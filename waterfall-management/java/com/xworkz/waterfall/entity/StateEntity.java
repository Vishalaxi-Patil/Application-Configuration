package com.xworkz.waterfall.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@NamedQueries({
	@NamedQuery(name="findAll", query="select state from StateEntity state"),
    @NamedQuery(name="findAllIds", query="select state.sid from StateEntity state "),
    @NamedQuery(name="findAllIdAndName", query="select state.sid,state.name from StateEntity state "),
    @NamedQuery(name="updatePopulationByName", query="update StateEntity state set state.population=:po where state.name=:nm"),
	@NamedQuery(name="findById", query="select state from StateEntity state where id=:id")
    
})
@Table(name="state")

public class StateEntity {
	@Id
	@Column(name= "SID")
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator  = "auto")

	private int sid;
	@Column(name= "NAME")
	
	private String name;
	@Column(name= "LANGUAGE")
	private String language;
	@Column(name= "POPULATION")
	private  double population;
	@Column(name= "NO_OF_DISTRICT")
	private int no_of_district;
	
	
	public StateEntity(String name,double population,int no_of_district,String language) {
		this.language=language;
		this.name=name;
		this.no_of_district=no_of_district;
		this.population=this.population;
		
	}

}
