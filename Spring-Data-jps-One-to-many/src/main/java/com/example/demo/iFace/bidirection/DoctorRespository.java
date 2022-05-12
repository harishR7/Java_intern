package com.example.demo.iFace.bidirection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.enitity.bidirection.Doctor;

public interface DoctorRespository extends JpaRepository<Doctor, Integer> {

}
