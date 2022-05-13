package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity

@Table(name = "harish_inherit_ins")
@Inheritance(strategy = InheritanceType.JOINED)
public class Insurance {
	
	
	@Id
	@Column(name = "policy_num")
	private int policyNumber;
	@Column(name = "policy_name",length =30,nullable = false)
	private String policyHolderName;
}
