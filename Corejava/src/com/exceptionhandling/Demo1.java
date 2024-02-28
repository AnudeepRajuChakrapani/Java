package com.exceptionhandling;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			System.out.println("ENTER 2 NUMBERS");
			int a=0,b=0,c=0;
			a=scn.nextInt();
			b=scn.nextInt();
			try
			{
				System.out.println("try starts");
				c=a/b;
				System.out.println("try ends");
			}
			catch(ArithmeticException  e )
			{
				System.out.println("catch executed");
				c=a/2;
			}
			System.out.println("c="+c);
		}
		

	}



