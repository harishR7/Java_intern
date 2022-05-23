package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "harish_driver")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
	
	@Id
	@Column(name = "driver_id")
	private int driverId;
	
	@Column(name = "driver_name")
	private String driverName;
	
	@Column(name = "phone_number")
	private long phoneNumber;
	
	@Column(name = "rate")
	private double rate;
	
	
}
