package com.example.demo.entity;





import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student 
{

	private int studentId;
	private String studentName;
	private double mark;
}
