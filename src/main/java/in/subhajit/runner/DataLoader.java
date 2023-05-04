package in.subhajit.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.subhajit.entity.CitizenPlan;
import in.subhajit.repo.CitizenPlanRepository;
import in.subhajit.util.ExcelGenerator;
import in.subhajit.util.PdfGenerator;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private CitizenPlanRepository repo;

     

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		repo.deleteAll();
		// cash-1 plan Data
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("Subhajit");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenifitAmount(6000.0);

		// cash-2 plan data
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Rajit");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Rental Income");

		// cash-3 plan data
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Prabhakar");
		c3.setGender("Male");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenifitAmount(8000.0);
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminationReason("Employed");

		// cash-4 plan Data
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Radhika");
		c4.setGender("Fe-Male");
		c4.setPlanName("Cash");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(8));
		c4.setBenifitAmount(14000.0);

		// cash-5 plan data
		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Smruti");
		c5.setGender("Fe-Male");
		c5.setPlanName("Cash");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Part-time Income");

		// cash-6 plan data
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Madhusmita");
		c6.setGender("Fe-Male");
		c6.setPlanName("Cash");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(2));
		c6.setPlanEndDate(LocalDate.now().plusMonths(4));
		c6.setBenifitAmount(9000.0);
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminationReason("Govt Job");

		// Food-7 plan Data
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Abhijit");
		c7.setGender("Male");
		c7.setPlanName("Food");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenifitAmount(7500.0);

		// Food-8 plan data
		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Milan");
		c8.setGender("Male");
		c8.setPlanName("Food");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("Property Income");

		// Food-9 plan data
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Suraj");
		c9.setGender("Male");
		c9.setPlanName("Food");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(3));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenifitAmount(5800.0);
		c9.setTerminatedDate(LocalDate.now());
		c9.setTerminationReason("Employed");

		// Food-10 plan Data
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Priyanka");
		c10.setGender("Fe-Male");
		c10.setPlanName("Food");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenifitAmount(10000.0);

		// Food-11 plan data
		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Debasmita");
		c11.setGender("Fe-Male");
		c11.setPlanName("Food");
		c11.setPlanStatus("Denied");
		c11.setDenialReason("Part-time Income");

		// Food-12 plan data
		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("Nibedita");
		c12.setGender("Fe-Male");
		c12.setPlanName("Food");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(2));
		c12.setPlanEndDate(LocalDate.now().plusMonths(8));
		c12.setBenifitAmount(12500.0);
		c12.setTerminatedDate(LocalDate.now());
		c12.setTerminationReason("Employed");

		// Medical-13 plan Data
		CitizenPlan c13 = new CitizenPlan();
		c13.setCitizenName("ChetanLal");
		c13.setGender("Male");
		c13.setPlanName("Medical");
		c13.setPlanStatus("Approved");
		c13.setPlanStartDate(LocalDate.now());
		c13.setPlanEndDate(LocalDate.now().plusMonths(6));
		c13.setBenifitAmount(4800.0);

		// Medical-14 plan data
		CitizenPlan c14 = new CitizenPlan();
		c14.setCitizenName("Swadhin");
		c14.setGender("Male");
		c14.setPlanName("Medical");
		c14.setPlanStatus("Denied");
		c14.setDenialReason("Property Job");

		// Medical-15 plan data
		CitizenPlan c15 = new CitizenPlan();
		c15.setCitizenName("Avishek");
		c15.setGender("Male");
		c15.setPlanName("Medical");
		c15.setPlanStatus("Terminated");
		c15.setPlanStartDate(LocalDate.now().minusMonths(3));
		c15.setPlanEndDate(LocalDate.now().plusMonths(6));
		c15.setBenifitAmount(15000.0);
		c15.setTerminatedDate(LocalDate.now());
		c15.setTerminationReason("Govt Job");

		// Medical-16 plan Data
		CitizenPlan c16 = new CitizenPlan();
		c16.setCitizenName("Mousumi");
		c16.setGender("Fe-Male");
		c16.setPlanName("Medical");
		c16.setPlanStatus("Approved");
		c16.setPlanStartDate(LocalDate.now());
		c16.setPlanEndDate(LocalDate.now().plusMonths(6));
		c16.setBenifitAmount(19000.0);

		// Medical-17 plan data
		CitizenPlan c17 = new CitizenPlan();
		c17.setCitizenName("Bishnupriya");
		c17.setGender("Fe-Male");
		c17.setPlanName("Medical");
		c17.setPlanStatus("Denied");
		c17.setDenialReason("Self-Business Income");

		// Medical-18 plan data
		CitizenPlan c18 = new CitizenPlan();
		c18.setCitizenName("Barsha Priyadarshini");
		c18.setGender("Fe-Male");
		c18.setPlanName("Medical");
		c18.setPlanStatus("Terminated");
		c18.setPlanStartDate(LocalDate.now().minusMonths(3));
		c18.setPlanEndDate(LocalDate.now().plusMonths(6));
		c18.setBenifitAmount(16000.0);
		c18.setTerminatedDate(LocalDate.now());
		c18.setTerminationReason("Employed");

		// Employment-19 plan Data
		CitizenPlan c19 = new CitizenPlan();
		c19.setCitizenName("Manash");
		c19.setGender("Male");
		c19.setPlanName("Employment");
		c19.setPlanStatus("Approved");
		c19.setPlanStartDate(LocalDate.now());
		c19.setPlanEndDate(LocalDate.now().plusMonths(6));
		c19.setBenifitAmount(28000.0);

		// Employment-20 plan data
		CitizenPlan c20 = new CitizenPlan();
		c20.setCitizenName("Pranay");
		c20.setGender("Male");
		c20.setPlanName("Employment");
		c20.setPlanStatus("Denied");
		c20.setDenialReason("Private Job");

		// Employment-21 plan data
		CitizenPlan c21 = new CitizenPlan();
		c21.setCitizenName("Sabyasachi");
		c21.setGender("Male");
		c21.setPlanName("Employment");
		c21.setPlanStatus("Terminated");
		c21.setPlanStartDate(LocalDate.now().minusMonths(4));
		c21.setPlanEndDate(LocalDate.now().plusMonths(6));
		c21.setBenifitAmount(7000.0);
		c21.setTerminatedDate(LocalDate.now());
		c21.setTerminationReason("Employed");

		// Employment-22 plan Data
		CitizenPlan c22 = new CitizenPlan();
		c22.setCitizenName("Payel Sila");
		c22.setGender("Fe-Male");
		c22.setPlanName("Employment");
		c22.setPlanStatus("Approved");
		c22.setPlanStartDate(LocalDate.now());
		c22.setPlanEndDate(LocalDate.now().plusMonths(6));
		c22.setBenifitAmount(13000.0);

		// Employment-23 plan data
		CitizenPlan c23 = new CitizenPlan();
		c23.setCitizenName("Suchismita");
		c23.setGender("Fe-Male");
		c23.setPlanName("Employment");
		c23.setPlanStatus("Denied");
		c23.setDenialReason("Property Income");

		// Employment-24 plan data
		CitizenPlan c24 = new CitizenPlan();
		c24.setCitizenName("Smrutirekha");
		c24.setGender("Fe-Male");
		c24.setPlanName("Employment");
		c24.setPlanStatus("Terminated");
		c24.setPlanStartDate(LocalDate.now().minusMonths(2));
		c24.setPlanEndDate(LocalDate.now().plusMonths(6));
		c24.setBenifitAmount(5900.0);
		c24.setTerminatedDate(LocalDate.now());
		c24.setTerminationReason("Govt Job");
		
		List<CitizenPlan>  list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24);
		
		repo.saveAll(list);

	}

}
