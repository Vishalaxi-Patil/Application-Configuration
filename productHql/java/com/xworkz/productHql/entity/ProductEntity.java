package com.xworkz.productHql.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@ToString
@NoArgsConstructor
@Entity
@Table(name="products")
public class ProductEntity {
	
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Id
	@Column(name="PID")
	private int pid;
	@Column(name="NAME")
	private String name;
	@Column(name="MANUFACTURER")
	private String manufacturer;
	@Column(name="BRAND")
	private String brand;
	@Column(name="PRICE")
	private double price;
	@Column(name="P_TYPE")
	@Enumerated(EnumType.STRING)
	private ProductType type;
	@Column(name="QUANTITY")
	private int quantity;
	@Column(name="QUALITY")
	private boolean quality;
	
	
	public enum ProductType{
		HOME_APPLIANCES,ELECTRONIC,COMPUTERS,FASHION
	}


	public ProductEntity(String name, String manufacturer, String brand, double price, ProductType type, int quantity,
			boolean quality) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
		this.quality = quality;
	}
	
	

}
