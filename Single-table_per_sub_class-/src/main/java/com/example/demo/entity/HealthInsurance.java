package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@DiscriminatorValue(value = "HEALTH")
public class HealthInsurance extends Insurance {
	@Column(name = "age")
	private int age;
	@Column(name = "status")
	private String status;
	public HealthInsurance(int policyNumber, String policyHolderName, int age, String status) {
		super(policyNumber, policyHolderName);
		this.age = age;
		this.status = status;
	}
	@Override
	public String toString() {
		return "HealthInsurance [age=" + age + ", status=" + status + ", getPolicyNumber()=" + getPolicyNumber()
				+ ", getPolicyHolderName()=" + getPolicyHolderName() + "]";
	}
	
	
	
}
