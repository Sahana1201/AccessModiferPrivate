package com.xworkz.accessmodifierprivate;

public class PrivateAccessModifierExample {

	
     private static int findSumOfTwoNumbers(int a , int b) {
    	 int sum;
    	 sum = a + b;
    	 return sum;
     }
     public static void main(String[] args) {
    	 int a=19 , b= 30 ;
    	 int result = findSumOfTwoNumbers(a, b);
    	 System.out.println ("the result is " +result); 
    	 
    	 }

	}


