package com.infogalaxy.emloyeewagecomputation;

import java.util.Random;
 
public class Welcome {
	
	public static void main(String args[])
	{
		System.out.println("Welcome to Employee Wage Computation");
		
		int attendance = 0;
		int dailyWage = 0;
		final int WAGE_PER_HR = 20;
		final int FULL_DAY_HR = 8;
		
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
			dailyWage = WAGE_PER_HR * FULL_DAY_HR ;
			System.out.print("Employee Wage :" + dailyWage);
		}
		
		
	
		
	}

}
