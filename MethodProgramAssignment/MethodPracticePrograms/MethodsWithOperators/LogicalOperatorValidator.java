package MethodsWithOperators;

import java.util.Scanner;

public class LogicalOperatorValidator {

	public static boolean isValidInput(boolean inputValid,boolean inputCondition) {
		if(inputValid==true&&inputCondition==true) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Is input valid (true/false):");
		boolean inpValid=sc.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false):");
		boolean inpCond=sc.nextBoolean();
		
		if(isValidInput(inpValid,inpCond)) {
			System.out.println("Input is valid.");
		}else {
			System.out.println("Input is not valid.");
		}
		
	}

}
