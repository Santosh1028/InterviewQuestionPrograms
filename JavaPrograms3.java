package com.programs;

import java.util.Arrays;

public class JavaPrograms3 {

	public static void main(String[] args) {

		// Bubble Sort in java

//		int arr[]= {4,5,1,7,6};
//		
//		System.out.println("Arrays before Sorting: "+Arrays.toString(arr));
//		
//		int n=arr.length;
//		
//		for(int i=0; i<n-1; i++) { // No of passes, n-1
//			for(int j=0; j<n-1; j++) { // for Iterations
//				if(arr[j]>arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//		
//		System.out.println("Arrays before Sorting: "+Arrays.toString(arr));

		// How to remove special character in java
//		String string="Santosh!-231";
//		
//		string=string.replaceAll("[^a-zA-Z0-9]", "");
//		
//		System.out.println(string);

		// How to remove white spaces in white spaces in string

//		String string="Santosh    Kumar    Madani";
//		
//		string=string.replace("\\s", "");
//		
//		System.out.println(string);

		// Count occurance of character in String

//		String string = "Java Programming and Java OOP";
//
//		int total1 = string.length();
//
//		int total2 = string.replace("a", "").length();
//
//		int count = total1 - total2;
//		System.out.println(count);

		// Count Words in String

//		String string = "Java Programming and Java OOP and Secure";
//
//		int count=1;
//		
//		for(int i=0; i<string.length(); i++) {
//			if((string.charAt(i)==' ') && (string.charAt(i+1)!=' ')) {
//				count++;
//			}
//		}
//		
//		System.out.println("Number of Words: "+count);
		
		// Reverse each words in String
		
//		String string="Welcome to Java";
//		
//		String revString="";
//		
//		for(int i=string.length()-1; i>=0; i--) {
//			revString=revString+string.charAt(i);
//		}
//		
//		System.out.println(revString);

	}

}
