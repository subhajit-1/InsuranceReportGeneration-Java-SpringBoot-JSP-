package in.subhajit.service.impl;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.subhajit.entity.CitizenPlan;
import in.subhajit.repo.CitizenPlanRepository;
import in.subhajit.request.SearchRequest;
import in.subhajit.service.ReportService;
import in.subhajit.util.EmailUtils;
import in.subhajit.util.ExcelGenerator;
import in.subhajit.util.PdfGenerator;

@Service
public class ServiceImpl implements ReportService {
	@Autowired
	private CitizenPlanRepository planRepo;
	@Autowired
	private ExcelGenerator excelGenerator;
	@Autowired
	private PdfGenerator pdfGenerator;
	@Autowired
	private EmailUtils emailUtils;
	

	@Override
	public List<String> getPlanNames() {
		return planRepo.getPlanNames();
	}

	@Override
	public List<String> getPlanStatuses() {
		return planRepo.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {

		CitizenPlan entity = new CitizenPlan();

		if (null != request.getPlanName() && !"".equals(request.getPlanName())) {
			entity.setPlanName(request.getPlanName());
		}
		if (null != request.getPlanStatus() && !"".equals(request.getPlanStatus())) {
			entity.setPlanStatus(request.getPlanStatus());
		}
		if (null != request.getGender() && !"".equals(request.getGender())) {
			entity.setGender(request.getGender());
		}

		if (null != request.getStartDate() && !"".equals(request.getStartDate())) {
			String startDate = request.getStartDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			// converting string to localdate
			LocalDate localDate = LocalDate.parse(startDate, formatter);
			entity.setPlanStartDate(localDate);
		}

		if (null != request.getEndDate() && !"".equals(request.getEndDate())) {
			String endDate = request.getEndDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			// converting string to localdate
			LocalDate localDate = LocalDate.parse(endDate, formatter);
			entity.setPlanEndDate(localDate);
		}

		return planRepo.findAll(Example.of(entity));
	}
	
	@Override
	public boolean exportExcel(HttpServletResponse response) throws Exception {

		File f = new File("Plans.xls");

		List<CitizenPlan> plans = planRepo.findAll();
		excelGenerator.generate(response, plans, f);

		String subject = "Test mail subject";
		String body = "<h2>Yours Plans Reports in excel file</h2>";
		String to = "subhajit.dw@gmail.com";

		emailUtils.sendEmail(subject, body, to, f);

		f.delete();

		return true;
	}


	@Override
	public boolean exportPdf(HttpServletResponse response) throws Exception {

		File f = new File("Plans.pdf");

		List<CitizenPlan> plans = planRepo.findAll();

		pdfGenerator.generate(response, plans, f);

		String subject = "Test mail subject";
		String body = "<h2>Yours Plans Reports in pdf file</h2>";
		String to = "smitamadhu683@gmail.com";

		emailUtils.sendEmail(subject, body, to, f);

		f.delete();

		return true;
	}


	


}


