package com.IRCTCResourceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IRCTCResourceApp.model.Passanger;

@Repository
public interface PassangerRepository extends JpaRepository<Passanger, Integer>{
	
	

}
