package com.sanjib.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sanjib.entity.CitizenPlan;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer>{
	
	//to get plan names dynamically from DB
	@Query("select distinct(planName) from CitizenPlan")
	public List<String> getPlanNames();
	
	//to get plan status dynamically from DB
	@Query("select distinct(planStatus) from CitizenPlan")
	public List<String> getPlanStatus();
	
	
}
