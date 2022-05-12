package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity	

@Table(name="harish_seminar")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seminar {
	
	@Id
	@Column(name = "seminar_id")
	int id;
	@Column(name = "seminar_name")
	String name;
	@Column(name = "seminar_duration")
	int duration;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="speaker_ref")
	private Speaker speaker;


}
