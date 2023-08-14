package MethodsPrograms;

import java.util.Scanner;

public class TheCalculatorDilemma {
	public static void Calculations(int Choice,int num1,int num2) {
		switch(Choice) {
		case 1:
			System.out.println("the addition of two numbrs are:"+" "+(num1+num2));
		      break;
		case 2:
			System.out.println("the Subtraction of two numbrs are:"+" "+(num1-num2));
		      break;
		case 3:
			System.out.println("the Multiplications of two numbrs are:"+" "+(num1*num2));
		      break;
		case 4:
			System.out.println("the Division of two numbrs are:"+" "+(num1/num2));
		      break;
		default:
			System.out.println("please enter the correct input value between 1 to 4");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Basic Mathematic calculations Alice");
		System.out.println("Enter the value of two numbers  you want perform Operations:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("To perform Operation choose below from 1 to 4");
		System.out.println("choose 1.For Addition");
		System.out.println("choose 2.For Subtraction");
		System.out.println("choose 3.For Multiplications");
		System.out.println("choose 4.For Division");
		System.out.print("enter your choice here ::");
		int choice=sc.nextInt();
		Calculations(choice,num1,num2);
	
		
	
		
	}

}
