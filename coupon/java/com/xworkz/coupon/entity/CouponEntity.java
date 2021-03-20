package com.xworkz.coupon.entity;
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
@Table(name="coupon")


public class CouponEntity {
	@Id
	@Column(name= "CID")
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator  = "auto")
	
	private int Cid;
	@Column(name= "NAME")
	private String name;
	@Column(name= "COUPON_TYPE")
	private String typeOfCode;
	@Column(name= "COUPON_CODE")
	private String code;
	@Column(name= "VALIDDATE")
	private int validateDate;
	
	
	
	

}
