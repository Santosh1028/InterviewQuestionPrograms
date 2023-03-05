package com.programs;

public class JavaPrograms {

	public static void main(String[] args) {
		// Swap two variables

//		int a=20;
//		int b=30;
//		
//		System.out.println("Before Swaping a: "+a+" b="+b);

//		int c=a;
//		a=b;
//		b=c;
//		
//		System.out.println("After Swaping a: "+a+" b="+b);

		// Swap two variables with out third variable

//		int a=20;
//		int b=30;
//		
//		System.out.println("Before Swaping a: "+a+" b="+b);
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println("After Swaping a: "+a+" b="+b);

		// Program to reverse a number

//		int numb=123;
//		int sum=0, rem;
//		
//		while(numb>0) {
//			rem=numb%10;
//			sum=(sum*10)+rem;
//			numb=numb/10;
//		}
//		
//		System.out.println(sum);

		// Program to reverse a number2

//		int numb=345;
//		
//		int rev=0;
//		
//		while(numb!=0) {
//			rev=rev*10+numb%10;
//			numb=numb/10;
//		}
//		
//		System.out.println(rev);

		// Program to reverse a number 3

//		int numb=546;
//		
//		StringBuffer sBuffer=new StringBuffer(String.valueOf(numb));
//		StringBuffer revBuffer=sBuffer.reverse();
//		
//		System.out.println(revBuffer);

		// How to Reverse a String 1

//		String string="Santosh";
//		
//		String revStr="";
//		
//		for(int i=string.length()-1; i>=0; i--) {
//			revStr=revStr+string.charAt(i);
//		}
//		
//		System.out.println(revStr);

//		String string = "Santosh";
//		char[] a = string.toCharArray();
//
//		int len = 0;
//
//		for (int i = 0; i < a.length; i++) {
//			len++;
//		}
//
//		
//
//		String revStr = "";
//
//		for (int i = len - 1; i >= 0; i--) {
//			revStr = revStr + string.charAt(i);
//
//		}
//		
//		System.out.println(revStr);

		// Pallindrom number

		/*
		 * int numb=151; int pNum=0; int temp=numb;
		 * 
		 * while(temp!=0) { pNum=pNum*10+temp%10; temp=temp/10; }
		 * 
		 * if(pNum==numb) { System.out.println("Pallindrom"); }
		 */

		// Pallidrome String

//		String string="Madam";
//		string=string.toLowerCase();
//		
//		String pString="";
//		
//		for(int i=string.length()-1; i>=0; i--) {
//			pString=pString+string.charAt(i);
//		}
//		
//		if(pString.equals(string)) {
//			System.out.println("Pallindrome String");
//		}

		// Count the Digits in Number

		/*
		 * int numb=5;
		 * 
		 * int count=0;
		 * 
		 * while(numb>0) { count++; numb=numb/10; }
		 * 
		 * System.out.println(count);
		 */

		// Count Even and Odd Digits in a Number

//		int number = 134459;
//		int even_count = 0;
//		int odd_count = 0;
//
//		while (number > 0) {
//			int rem = number % 10;
//
//			if (rem % 2 == 0) {
//				even_count++;
//			} else {
//				odd_count++;
//			}
//
//			number = number / 10;
//		}
//
//		System.out.println(even_count);
//		System.out.println(odd_count);

		// Sum of Digits in a Number

//		int numb=123;
//		
//		int sum=0;
//		
//		while(numb>0) {
//			sum=sum+numb%10;
//			numb=numb/10;
//		}
//		
//		System.out.println(sum);
		
		// Largest of 3 Numbers using Ternary operator
//		int a=10, b=20, c=30;
//		
//		int largest=a>b?a:b;
//		
//		System.out.println(largest);
//		
//		int largest2=c>largest?c:largest;
//		
//		System.out.println(largest2);
		
		// Fibonacci Series
		
		int n1=0, n2=1, sum=0;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2; i<6; i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
			System.out.print(" "+sum);
		}
		
		

	}
}
