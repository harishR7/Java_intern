package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Seminar;

public interface Seminarrepository extends JpaRepository<Seminar, Integer> {

}
