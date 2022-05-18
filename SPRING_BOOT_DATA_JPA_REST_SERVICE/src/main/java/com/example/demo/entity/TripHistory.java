package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "harish_triphistory")
public class TripHistory {

	
	@Id
	@Column(name = "trip_id")
	private int tripId;
	@Column(name = "trip_datetime")
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDateTime tripDateTime;
	@Column(name = "startpoint")
	private String startpoint;
	@Column(name = "destination")
	private String destination;
	@Column(name = "price")
	private double price;
	
}
