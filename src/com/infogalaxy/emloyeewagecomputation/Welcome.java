package com.infogalaxy.emloyeewagecomputation;

import java.util.Random;
 
public class Welcome {
	
	public static void main(String args[])
	{
		System.out.println("Welcome to Employee Wage Computation");
		
		int attendance = 0;
		
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
		}
		
		
	
		
	}

}
