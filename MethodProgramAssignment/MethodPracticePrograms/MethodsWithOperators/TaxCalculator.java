package MethodsWithOperators;

import java.util.Scanner;

public class TaxCalculator {
	public static double calculateTotalWithTax(double purchaseAmount,double taxRate) {
		double totalcost=purchaseAmount*taxRate;
		return totalcost+purchaseAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purchase amount:");
		double purchaseAmount=sc.nextDouble();
		System.out.println("Enter the tax rate (in decimal form):");
		double taxRate=sc.nextDouble();
		System.out.println("Total cost including tax:"+calculateTotalWithTax(purchaseAmount,taxRate));
	}

}
