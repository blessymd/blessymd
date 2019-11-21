package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.Studentbean;

public interface StudentRepo extends JpaRepository<Studentbean, Integer>{

}
