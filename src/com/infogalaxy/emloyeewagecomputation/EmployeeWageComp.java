package com.infogalaxy.emloyeewagecomputation;

import java.util.Random;
 
public class EmployeeWageComp {
	
	public static void main(String args[])
	{
		System.out.println("Welcome to Employee Wage Computation");
		
		int attendance ;
		int dailyWage = 0 ;
		int employee_Type ;
		int  totalWage= 0;
		final int WAGE_PER_HR = 20;
		final int PART_TIME_HR = 4;
		final int FULL_TIME_HR = 8;
 		final int workingDay = 20;

		for (int i=1 ;i <= workingDay ; i++)
		{
			System.out.println("Day :"+i);

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
					 	break;

						case 1 :
						System.out.println("Employee is Full Time");
						dailyWage = FULL_TIME_HR * WAGE_PER_HR ;
						System.out.println("Employee Wage is :" + dailyWage);																
						break;
					}
					break;

			}
				
			totalWage+=dailyWage;
			System.out.println("Total Monthly Wage :" + totalWage);
			System.out.println("------------------------------");
		}
		

		 
		 
	}

}
