package com.infogalaxy.emloyeewagecomputation;

import java.util.Random;
 
public class EmployeeWageComp {
	
	public static void main(String args[])
	{
		System.out.println("Welcome to Employee Wage Computation");
		
		int attendance ;
		int partTimer_dailyWage = 0 ;
		int fullTimer_dailyWage = 0 ;
		int employee_Type ;
		final int WAGE_PER_HR = 20;
		final int PART_TIME_HR = 4;
		final int FULL_TIME_HR = 8;
		int monthltAtten_Part_time_Emp = 0;
		int monthltAtten_Full_time_Emp = 0;
		int monthlyWage = 0;
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
						partTimer_dailyWage = PART_TIME_HR * WAGE_PER_HR ;
						System.out.println("Employee Wage is :" + partTimer_dailyWage );
						monthltAtten_Part_time_Emp+=1;
					//	monthlyWage = monthltAtten_Part_time_Emp * partTimer_dailyWage ;  
					 	break;

						case 1 :
						System.out.println("Employee is Full Time");
						fullTimer_dailyWage = FULL_TIME_HR * WAGE_PER_HR ;
						System.out.println("Employee Wage is :" + fullTimer_dailyWage);
						monthltAtten_Full_time_Emp+=1;
				//		monthlyWage = monthltAtten_Full_time_Emp * fullTimer_dailyWage  ;  
						break;

					 
					}

			break;

			
			}
			
			System.out.println("------------------------------");
			
			
		}
		
		Random random = new Random();
		employee_Type =random.nextInt(3)%2;
		
		if(employee_Type==0)
		{
		monthlyWage = monthltAtten_Part_time_Emp * partTimer_dailyWage ;
		System.out.println("Monthly Addence of Part Time Employee :" + monthltAtten_Part_time_Emp+"\n"+"Part Timer Employee Salary :" + monthlyWage);
		}
		else
		{
		monthlyWage = monthltAtten_Full_time_Emp * 	fullTimer_dailyWage ;
		System.out.println("Monthly Attendance of Full Time Employee :" + monthltAtten_Full_time_Emp +"\n"+ "Full Timer Employee Salary :" + monthlyWage);
		}

		 
	}

}
