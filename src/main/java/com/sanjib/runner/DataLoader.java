package com.sanjib.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.sanjib.entity.CitizenPlan;
import com.sanjib.repo.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private CitizenPlanRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		// cash plan data
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("John");
		c1.setPlanName("Cash");
		c1.setGender("Male");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmount(5000.0);

		// cash plan data
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Roman");
		c2.setPlanName("Cash");
		c2.setGender("Male");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Rental Income");

		// cash plan data
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Angelina");
		c3.setPlanName("Cash");
		c3.setGender("Female");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(2));
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminationReason("Employeed");

		// food plan data
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Green");
		c4.setPlanName("food");
		c4.setGender("Male");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmount(4000.0);

		// food plan data
		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("smith");
		c5.setPlanName("food");
		c5.setGender("Male");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("salaried");

		// food plan data
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Angelina");
		c6.setPlanName("food");
		c6.setGender("Female");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(2));
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminationReason("land");

		// medical plan data
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("sipu");
		c7.setPlanName("medical");
		c7.setGender("Male");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmount(4000.0);

		// medical plan data
		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("smith");
		c8.setPlanName("medical");
		c8.setGender("Male");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("high income");

		// medical plan data
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("becky");
		c9.setPlanName("medical");
		c9.setGender("Female");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(4));
		c9.setPlanEndDate(LocalDate.now().plusMonths(2));
		c9.setTerminatedDate(LocalDate.now());
		c9.setTerminationReason("business growth");

		// employement plan data
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("chiku");
		c10.setPlanName("employeement");
		c10.setGender("Male");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmount(12000.0);

		// employement plan data
		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("jason");
		c11.setPlanName("employeement");
		c11.setGender("Male");
		c11.setPlanStatus("Denied");
		c11.setDenialReason("govt. employee");

		// employement plan data
		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("rima");
		c12.setPlanName("employeement");
		c12.setGender("Female");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(2));
		c12.setTerminatedDate(LocalDate.now());
		c12.setTerminationReason("business growth");

		List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
		repo.saveAll(list);
	}

}
