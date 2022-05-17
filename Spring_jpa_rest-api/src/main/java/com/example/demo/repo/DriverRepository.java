package com.example.demo.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
	
	List<Driver>findByDriverName(String name);
	
	List<Driver> findByPhoneNumber(long number);
	
	@Query(value= "from Driver where rate=:srchValue")
	List<Driver> searchByRate(@Param("srchValue")double rate);
	
	
	@Query(value= "Update Driver set rate=:rateValue where driverId=:id")
	@Modifying
	@Transactional
	int modifyRating(@Param("id")int driveId,@Param("rateValue")double nayaRating);
	
	
}
