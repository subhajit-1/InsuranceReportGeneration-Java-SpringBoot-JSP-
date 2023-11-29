# Insurance Report Generation App

## Overview

This repository hosts the source code for the Insurance Report Generation App, a project designed for managing citizen insurance plans. The application allows dynamic search functionality based on various criteria, exporting data to Excel and PDF formats, and sending the generated files as email attachments. Citizens' records are manually inserted into the database table with given permutations and combinations.

## Project Components

1. **CitizenPlan.java (Entity Class):** Represents the Citizen Plans Information entity.
2. **CitizenPlanRepository.java (Interface):** Repository interface for database interactions.
3. **ReportService.java (Interface):** Service interface for report-related operations.
4. **ReportServiceImpl.java (Class):** Implementation class for report-related operations.
5. **PdfGenerator.java (Class):** Utility class for generating PDF reports.
6. **ExcelGenerator.java (Class):** Utility class for generating Excel reports.
7. **EmailUtils.java (Class):** Utility class for handling email operations.
8. **ReportController.java (Class):** Controller class handling HTTP requests.
9. **SearchRequest.java (Class):** Form binding class for search criteria.
10. **DataLoader.java (Runner Class):** Inserts data into the CITIZEN_PLANS_INFO table.
11. **index.jsp:** Welcome page.

Database Table
CITIZEN_PLANS_INFO:


| Field            | Type          | Constraints                 |
|------------------|---------------|-----------------------------|
| CITIZEN_ID       | NUMBER        | PRIMARY KEY                 |
| CITIZEN_NAME     | VARCHAR       |                             |
| GENDER           | VARCHAR       |                             |
| PLAN_NAME        | VARCHAR       |                             |
| PLAN_STATUS      | VARCHAR       |                             |
| PLAN_START_DATE  | DATE          |                             |
| PLAN_END_DATE    | DATE          |                             |
| BENEFIT_AMOUNT   | NUMBER        |                             |
| DENIAL_REASON    | VARCHAR       |                             |
| TERMINATED_DATE  | DATE          |                             |
| TERMINATION_REASON | VARCHAR     |                             |

This table represents the structure of the `CITIZEN_PLANS_INFO` table with its fields, data types, and constraints.

## Project Setup

1. Create a starter project with required dependencies.
2. Configure Data Source & View Resolver in the properties file.
3. Create Entity class & repository interface.
4. Create a runner to load data into the database table.
5. Create a form binding class.
6. Create a service interface with abstract methods.
7. Create a service implementation class.
8. Create a controller class.
9. Create utility classes (PdfGenerator, ExcelGenerator & EmailUtils).
10. Create the view page (JSP) & add Bootstrap CSS & Bootstrap JS (www.getbootstrap.com).
11. Run the application and access the welcome page.


## Dynamic Search Functionality

- Plan Name dropdown values come from the database table.
- Plan Status dropdown values come from the database table.
- Dynamic search fetches records based on selected criteria.
- Clicking on 'Search' without selecting any filter fetches all records from the DB table.

## Export to Excel & PDF

- Clicking on 'Excel' exports complete database table data to an Excel file and sends it as an attachment to your email.
- Clicking on 'PDF' exports complete database table data to a PDF file and sends it as an attachment to your email.

## How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/subhajit-1/InsuranceReportGeneration-Java-SpringBoot-JSP-.git
   ```

2. Open the project in your preferred IDE.

3. Configure the datasource in the `application.properties` file.

4. Run the application.

5. Access the welcome page.

## Author

SUBHAJIT DAS 



## Contribution

Contributions are welcome! Feel free to open issues, submit pull requests, or provide suggestions for improvement.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
