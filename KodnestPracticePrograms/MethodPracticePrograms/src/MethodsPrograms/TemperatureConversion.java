package MethodsPrograms;

import java.util.Scanner;

public class TemperatureConversion {
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit-32) * 5/9;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Toool..");
		System.out.println("Select an option :");
		System.out.println("1. Convert Celsius to Fahrenheit");
		System.out.println("2. Convert Fahrenheit to Celsius");
		System.out.print("enter your choice here ::");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("enter the temprature in celsius:");
			double celsius=sc.nextDouble();
			System.out.println(celsius+" is equivalent to "+celsiusToFahrenheit(celsius)+" F"); 
			break;
		case 2:
			System.out.println("Enter the temperature in Fahrenheit:");
			double fahrenheit=sc.nextDouble();
			System.out.println(fahrenheit+" is equivalent to "+fahrenheitToCelsius(fahrenheit)+" C");
			break;	
		default:
			System.out.println("choose the correct option between 1 and 2");
		}
		
		
		
		
	
		
	}
}
