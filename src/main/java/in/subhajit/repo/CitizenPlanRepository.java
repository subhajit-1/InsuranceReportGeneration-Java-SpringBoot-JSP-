package in.subhajit.repo;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.subhajit.entity.CitizenPlan;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer> {
	
	@Query("select distinct (planName) from CitizenPlan")
	public List<String> getPlanNames() ;
	
	@Query("select distinct (planStatus) from CitizenPlan")
	public List<String> getPlanStatus() ;
	
	
	

}
