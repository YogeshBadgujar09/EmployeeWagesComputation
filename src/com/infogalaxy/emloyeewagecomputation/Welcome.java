package com.infogalaxy.emloyeewagecomputation;

import java.util.Random;
 
public class Welcome {
	
	public static void main(String args[])
	{
		System.out.println("Welcome to Employee Wage Computation");
		
		int attendance ;
		int dailyWage ;
		int employee_Type ;
		final int WAGE_PER_HR = 20;
		final int PART_TIME_HR = 4;
		final int FULL_TIME_HR = 8;
		
		Random random = new Random();
	    attendance = random.nextInt(9)%2;
		
		System.out.println(attendance);
		if(attendance == 0)
		{
			System.out.println("Employee is Absend");
		}
		else
		{
			System.out.println("Employee is Present");
			employee_Type = random.nextInt(9)%2;
			if(employee_Type==0)
			{
				System.out.println("Employee is Part Time");
				dailyWage = WAGE_PER_HR * PART_TIME_HR ;
			}
			else
			{
				System.out.println("Employee is Full Time");
				dailyWage = WAGE_PER_HR * FULL_TIME_HR ;
			}
			
			System.out.print("Employee Wage :" + dailyWage);

 			
		}
		
		
	
		
	}

}
