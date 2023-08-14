package MethodsWithOperators;

import java.util.Scanner;

public class MethodOverloadingCalculator {
	public static int calculate(int num1,int num2) {
		return num1+num2;
	}
	public static double calculate(short num1,short num2,char operator) {
		return num1-num2;
	}
	public static double calculate(float num1,float num2,char operator) {
		return num1*num2;
	}
	public static double calculate(double num1,double num2,char operator) {
		return num1/num2;
	}
//	public static double calculate(double num1,double num2,char operator) {
//		switch(operator) {
//		case'-':
//			return num1-num2;
//		case'*':
//			return num1*num2;
//		case'/':
//			return num1/num2;
//		default:
//			System.out.println("enter the valid operator");
//		}
//		return 0.0;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the operator (+, -, *, /):");
		char operator=sc.next().charAt(0);
		  
		  switch(operator) {
		  case '+':
			  System.out.println("Enter the first number:");
				int num1=sc.nextInt();
				System.out.println("Enter the second number:");
				int num2=sc.nextInt();
			  System.out.println(calculate(num1,num2)); 
			  break;
		  case '-':
			  System.out.println("Enter the first number:");
				short number=sc.nextShort();
				System.out.println("Enter the second number:");
				short number2=sc.nextShort();
			  System.out.println(calculate(number,number2,'-')); 
			  break;
		  case '*':
			  System.out.println("Enter the first number:");
			   float n1=sc.nextFloat();
				System.out.println("Enter the second number:");
				float n2=sc.nextFloat();
			  System.out.println(calculate(n1,n2,'*')); 
			  break;
		  case '/':
			  System.out.println("Enter the first number:");
			   double a=sc.nextDouble();
				System.out.println("Enter the second number:");
				double b=sc.nextDouble();
			  System.out.println(calculate(a,b,'/')); 
			  break;	
		  default:
				System.out.println("enter the valid operator");	  
		  }


	}

}
