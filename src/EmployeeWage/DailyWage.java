package EmployeeWage;

public class DailyWage {

	public static void main(String[] args) 
    {
     System.out.println("Daily Wage " );    	
       // decleartion
	int attendance=(int)(Math.random()*2); 
	int salary; 
    int empRatePerHr=20; 
	int empHrs=8; 
	// Checking attandance
		if (attendance == 1) 
			// Calculating salary
            salary=empHrs*empRatePerHr ; 
	        else
		  salary=0;
                    
                System.out.println("Daily Wage of an Employee= " +salary);    
     }
}
