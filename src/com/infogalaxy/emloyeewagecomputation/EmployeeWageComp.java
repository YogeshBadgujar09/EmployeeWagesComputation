package com.infogalaxy.emloyeewagecomputation;

import java.util.Random;
 
public class EmployeeWageComp {
	
	int attendance ;
	int dailyWage = 0 ;
	int employee_Type ;
	int totalWage= 0;
	int working_Hr = 0;
	int working_Day = 1;
	int wage_per_Hr ;
	final int PART_TIME_HR = 4;
	final int FULL_TIME_HR = 8;
	int monthly_working_Day ;
	int minimum_working_Hr ;


	public EmployeeWageComp(int wage_per_Hr, int monthly_working_Day, int minimum_working_Hr) 
	{
		this.wage_per_Hr = wage_per_Hr;
		this.monthly_working_Day = monthly_working_Day;
		this.minimum_working_Hr = minimum_working_Hr;
	}


	public void employeeWagecal()
	{
		System.out.println("Welcome to Employee Wage Computation");
		
		while(working_Hr <= minimum_working_Hr  && working_Day <= monthly_working_Day )
		{
		
			System.out.println("Day :"+ working_Day );

			Random random = new Random();
			attendance = random.nextInt(9)%2;
	
			System.out.println(attendance);
			switch(attendance)
			{
				case 0 :
					System.out.println("Employee is Absend");
					break;

				case 1 :
					System.out.println("Employee is Present");
			 
					employee_Type = random.nextInt(9)%2;

					switch(employee_Type)
					{
						case 0 :
							System.out.println("Employee is Part Time");
							dailyWage = PART_TIME_HR * wage_per_Hr ;
							System.out.println("Employee Wage is :" +  dailyWage );
							working_Hr += PART_TIME_HR;
							break;

						case 1 :
							System.out.println("Employee is Full Time");
							dailyWage = FULL_TIME_HR * wage_per_Hr ;
							System.out.println("Employee Wage is :" + dailyWage);
							working_Hr += FULL_TIME_HR;
							break;
					}
					break;

			}
			
			totalWage+=dailyWage;
			System.out.println("Total Wage :" + totalWage); 
			System.out.println("Total Working Hours :"+working_Hr);

			System.out.println("------------------------------");
		
			working_Day++;
		}
		System.out.println("Total Working Hours In month :"+ working_Hr);
		System.out.println("Total Monthly Wage :" + totalWage); 
	
	}
	
	
	public static void main(String args[])
	{
		
		EmployeeWageComp employeewagecomp = new EmployeeWageComp(20,18,50);
		employeewagecomp.employeeWagecal();		
		 
	}

}
