package com.sanjib.service;

import java.util.List;

import com.sanjib.entity.CitizenPlan;
import com.sanjib.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanNames();
	
	public List<String> getPlanStatus();
	
	public List<String> getAllData();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPdf();

}
