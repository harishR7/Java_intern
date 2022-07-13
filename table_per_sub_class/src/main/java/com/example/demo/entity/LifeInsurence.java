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
@Table(name = "harish_inhert_life")
@PrimaryKeyJoinColumn(name = "id" ,referencedColumnName = "policy_num")
public class LifeInsurence extends Insurance{
	
	@Column(name = "age")
	private int age;
	@Column(name = "profile")
	private String profile;
	
	public LifeInsurence(int policyNumber, String policyHolderName, int age, String profile) {
		super(policyNumber, policyHolderName);
		this.age = age;
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "LifeInsurence [age=" + age + ", profile=" + profile + ", getPolicyNumber()=" + getPolicyNumber()
				+ ", getPolicyHolderName()=" + getPolicyHolderName() + "]";
	}

}
