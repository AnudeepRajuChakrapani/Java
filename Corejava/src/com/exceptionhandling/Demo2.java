package com.exceptionhandling;

public class Demo2 {

	public static void main(String[] args) {
		try
		{
			
			int a = 5/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
