package com.bridgelabz.LeapYear;

import org.apache.logging.log4j.Logger;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger Log = LogManager.getLogger(App.class);

	private int Year;
	public static void main( String[] args )
	{

		int a;
		// this section of the code will generate log file and print log message on console
		String message="Welcome ";
		Log.debug(message + " will be printed on Debug");
		Log.info(message + " Will be printed on info");
		Log.warn(message + " will be printed on warn");
		Log.error(message + " will be printed on error");
		Log.fatal(message + " will be printed on fatal");
		Log.info("Appending String: {}.", message);
		System.out.println(message);
		App A= new App();
		A.setYear();
		a=A.validateYear(A.Year);
		if(a ==1) {
			A.leapYear();

		}
		else
			System.out.println("not a valid input");

	}

	//method to set values for year
	public void setYear() {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value for Year");
		Year=sc.nextInt();

	}
	//method to validate the input
	public int validateYear(int a) {
		if(a>999 && a<10000) {
			return 1;
		}
		else
			return 0;
	}

	//method to find year is leap or not
	public void leapYear() {

		if(this.Year%400==0)
			System.out.println(this.Year +" is a leap year");
		else  if(this.Year%100!=0)
		{
			if(this.Year%4==0)                    
				System.out.println(this.Year +" is a leap year");
			else			          
				System.out.println(this.Year +" is not a leap year");                       
		}
		else
			System.out.println(this.Year +" is not a leap year");                       

	}


}
