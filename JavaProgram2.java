package com.programs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class JavaProgram2 {

	public static void main(String[] args) {

		// Program to check if Number is Prime or Not

//		int pNum=11;
//		
//		boolean f=false;
//		
//		for(int i=2; i<pNum; i++) {
//			if(pNum%i==0) {
//				f=true;
//			}
//		}
//		
//		if(f) {
//			System.out.println("Number is Not Prime Number");
//		}
//		
//		else {
//			System.out.println("Number is Prime Number");
//		}

		// How to Generate random Number and Strings in Java

//		Random random=new Random();
//		System.out.println(random.nextInt(10));
//		
//		System.out.println(Math.random());
//		
//		// Random String
//		
//		String randNum=RandomStringUtils.randomNumeric(10);

		// Program to find Factorial of A Number

//		int numb=6;
//		int fact=1;
//		
//		for(int i=numb; i>0; i--) {
//			fact=fact*i;
//		}
//		
//		System.out.println(fact);

		// Find Some of Elements in an array

//		int arr[]= {1,2,3,4,5, 6};
//		
//		int sum=0;
//		
//		for(int i=0; i<arr.length; i++) {
//			sum=sum+arr[i];
//		}
//		
//		System.out.println(sum);

		// Find the even and Odd Number in Array and Counts the number

//		int arr[] = { 1, 2, 3, 4, 5, 6,10 };
//		int evenCount = 0;
//		int oddCount = 0;
//
//		System.out.println("Even Numbers...");
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] % 2 == 0) {
//				System.out.println(arr[i]);
//				evenCount++;
//			}
//
//		}
//
//		System.out.println("Odd Numbers...");
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] % 2 != 0) {
//				System.out.println(arr[i]);
//				oddCount++;
//			}
//
//		}
//
//		System.out.println("Odd Numbers..." + oddCount);
//		System.out.println("Even Numbers..." + evenCount);

		// How to check to if two array are same or not

//		int arr1[] = { 1, 2, 3, 4, 5, 6,10 };
//		int arr2[] = { 10, 2, 3, 4, 5, 6,1 };
//		
//		System.out.println(Arrays.equals(arr1, arr2));

		// Find Missing Number in array

//		int arr[]= {1,2,3,4,6}; // No duplicates, Range should be proper, not need of sorted array
//		
//		int sum1=0;
//		
//		for(int i=0; i<arr.length; i++) {
//			sum1=sum1+arr[i];
//		}
//		
//		int sum2=0;
//		
//		for(int i=1; i<=6; i++) {
//			sum2=sum2+i;
//		}
//		
//		int missingNumber=sum2-sum1;
//		
//		System.out.println("Missing Number is: "+missingNumber);

		// Find Maximum and Minimum in an array

//		int arr[] = { 1, -2, 15, 4, 6, 11 };
//
//		int max = arr[0];
//
//		for (int i = 1; i < arr.length; i++) {
//			if(max<arr[i]) { // For Maximum
//			max=arr[i];
//			}
//			
//			if(max>arr[i]) {
//				max=arr[i];
//			}
//
//		}
//
//		System.out.println("Maximum Element is " + max);
		
		
//		String arr[]= {"Java", "C++","Python"};
//		
//		System.out.println("Duplicates Elements: ");
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i].equals(arr[j])) {
//					System.out.print(arr[i]+", ");
//				}
//			}
//		}
		
		
		// Linear Search in Java
		
//		int arr[]= {10, 20, 30, 40};
//		int key=40;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]==key) {
//				System.out.println("Element Found on:"+i);
//			}
//			
//		}
//		
		
		

	}

}
