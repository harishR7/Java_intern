package com.example.demo.iFace.bidirection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.enitity.bidirection.Patient;

public interface PatientRespository extends JpaRepository<Patient, Integer> {

}
 