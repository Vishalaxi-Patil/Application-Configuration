package com.xworkz.icecream.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "icecream")
//@NamedQueries({
//		@NamedQuery(name = "deleteByName", query = "delete IcecreamEntity from icecream where icecream.name=:nm ") 
//		})
public class IcecreamEntity {
	@Id
	@Column(name = "CID")
	private int cid;
	@Column(name = "NAME")
	private String name;
	@Column(name = "FLAVOUR")
	@Enumerated(EnumType.STRING)
	private Flavour flavour;
	@Column(name = "COLOUR")
	@Enumerated(EnumType.STRING)
	private Colour colour;
	@Column(name = "PRICE")
	private double price;

	public enum Flavour {
		PISTA, STRAWBERRY, BLACK_CURRENT, BUTTER_SCOTCH, REDVELVET, CHOCOLATE
	}

	public enum Colour {
		BLUE, PINK, YELLOW, RED, GREEN, BROWN
	}

	public IcecreamEntity(int id, String name, Flavour flavour, Colour colour, double price) {
		super();
		this.name = name;
		this.flavour = flavour;
		this.colour = colour;
		this.price = price;
	}

}
