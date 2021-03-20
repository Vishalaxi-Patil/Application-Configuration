package com.xworkz.entity;

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
@Table(name="contact_page")

public class ContactForm {
	@Id
	@GenericGenerator(name="auto" , strategy="increment")
	@GeneratedValue(generator="auto")
	
	@Column(name= "ID")
	private int id;
	@Column(name= "NAME")
	private String name;
	@Column(name= "PHONE_NO")
	private String phone_number;
	@Column(name= "EMAIL")
	private String email;
	@Column(name= "YOURSELF")
	private String yourself;
	public ContactForm(String name, String phone_number,String email, String yourself) {
		super();
		this.name = name;
		this.phone_number = phone_number;
		this.email=email;
		this.yourself = yourself;
	}
	
	

}
