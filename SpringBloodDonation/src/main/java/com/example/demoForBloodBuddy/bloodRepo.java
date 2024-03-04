package com.example.demoForBloodBuddy;

import org.springframework.data.jpa.repository.JpaRepository;

public interface bloodRepo extends JpaRepository<Blood, Long>{
	
}