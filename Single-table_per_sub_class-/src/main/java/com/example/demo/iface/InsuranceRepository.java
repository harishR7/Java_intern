package com.example.demo.iface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

import com.example.demo.entity.Insurance;
import com.example.demo.entity.*;
public interface InsuranceRepository <T extends Insurance>  extends JpaRepository<T, Integer> {

	
	 @Query("from LifeInsurence")
	  List<LifeInsurence> findAllLifePolicy();
	 
	 @Query("from HealthInsurance")
	  List<HealthInsurance> findAllHealthPolicy();

}
