package com.infogalaxy.emloyeewagecomputation;

import java.util.Random;
 
public class EmployeeWageComp {
	
	int attendance ;
	int dailyWage = 0 ;
	int employee_Type ;
	int totalWage= 0;
	int working_Hr = 0;
	int working_Day = 1;
	final int WAGE_PER_HR = 20;
	final int PART_TIME_HR = 4;
	final int FULL_TIME_HR = 8;
	final int MONTHLY_WORKIND_DAY = 20;
	final int MINIMUM_WORKING_HR = 100;
	
	
	public void employeeWagecal()
	{
		System.out.println("Welcome to Employee Wage Computation");
		
		while(working_Hr <= MINIMUM_WORKING_HR  && working_Day <= MONTHLY_WORKIND_DAY )
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
							dailyWage = PART_TIME_HR * WAGE_PER_HR ;
							System.out.println("Employee Wage is :" +  dailyWage );
							working_Hr += PART_TIME_HR;
							break;

						case 1 :
							System.out.println("Employee is Full Time");
							dailyWage = FULL_TIME_HR * WAGE_PER_HR ;
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
		
		EmployeeWageComp employeewagecomp = new EmployeeWageComp();
		employeewagecomp.employeeWagecal();		
		 
	}

}
