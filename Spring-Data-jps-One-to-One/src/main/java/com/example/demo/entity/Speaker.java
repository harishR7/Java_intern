package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "harish_speaker")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Speaker {
	
	@Id
	@Column(name = "speaker_id")
	int id;
	@Column(name = "speaker_firstname")
	String firstName;
	@Column(name = "speaker_qualification")
	String qualification;
}
