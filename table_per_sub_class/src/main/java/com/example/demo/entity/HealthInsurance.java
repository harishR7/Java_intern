package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "harish_inhert_health")
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "policy_num")
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
