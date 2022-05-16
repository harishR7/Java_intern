package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
	
}
