package MethodsWithOperators;

import java.util.Scanner;

public class BitwiseBitCounter {
	
	public static int countSetBits(int num) {
		int binaryConvrtedNum=Integer.parseInt(Integer.toBinaryString(num));
		int count=0;
		while(binaryConvrtedNum>0) {
			int lastdigit=binaryConvrtedNum%10;
			if(lastdigit==1) {
				count++;
			}
			binaryConvrtedNum=binaryConvrtedNum/10;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to count set setbits of 1");
		int num=sc.nextInt();
		
		System.out.println(countSetBits(num));
	}

}
