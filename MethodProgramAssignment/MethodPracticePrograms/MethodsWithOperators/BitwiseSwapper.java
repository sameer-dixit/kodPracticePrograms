package MethodsWithOperators;

import java.util.Scanner;

public class BitwiseSwapper {
	public static void swapXor(int num1,int num2) {
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("numbers after  swap:");
		
		System.out.println("number1== "+num1+" number2== "+num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers to swap");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("numbers before swap:");
		System.out.println("number1== "+x+" number2== "+y);
		swapXor(x,y);
	}

}
