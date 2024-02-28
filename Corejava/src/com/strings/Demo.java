package com.strings;

public class Demo {

	public static void main(String[] args) {
		String s1=new String("abcd");
		System.out.println(s1);
		String s2="abcd";
		System.out.println(s2);
		char[] a= {'a','b','c','d'	};
		String s3=new String(a);
		System.out.println(s3);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		
		System.out.println();
		String s4="Abcd";
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		
	}
}
