package com.infogalaxy.emloyeewagecomputation;

import java.util.Scanner;

public class Welcome {
	
	public static void main(String args[])
	{
		System.out.println("Welcome to Employee Wage Computation");
		
		int attendance = 0;
		
		System.out.print("Enter a Employee Attendance [0 - Absent / 1 - Present] :");
		Scanner obj = new Scanner(System.in);
		attendance = obj.nextInt();
		
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
