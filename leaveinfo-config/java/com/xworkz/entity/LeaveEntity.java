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
@Table(name = "leave_info")

public class LeaveEntity {

	@Id
	@GenericGenerator(name="auto" , strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "NO")
	private String no;
	@Column(name = "REASON")
	private String reason;
	@Column(name = "DATE")
	private String date;

	public LeaveEntity(String name, String email, String no, String reason, String date) {
		super();
		this.name = name;
		this.email = email;
		this.no = no;
		this.reason = reason;
		this.date = date;
	}

}
