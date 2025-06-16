package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.rci;
@Repository
public interface rciRepository extends JpaRepository<rci,Integer>{

	
	public rci findById(int id);
}
