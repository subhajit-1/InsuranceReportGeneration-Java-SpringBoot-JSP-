package in.subhajit.request;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchRequest implements Serializable {
	
	
	private String planName;
	private String planStatus;
	private String gender;
	private String startDate;
	private String endDate;
	


}
