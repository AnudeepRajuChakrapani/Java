package com.strings;

public class Demo1 {

	public static void main(String[] args) {
	String s="aaanu";
	System.out.println(replace(s,'a','@'));
	}

	private static String replace(String s, char ch1, char ch2) {
		char [] ch=s.toCharArray();
		for(int i=0;i<=s.length();i++)
		{
			if(ch[i]==ch1) {
				
				ch[i]=ch2;
			}
				}
		return new String(ch);
	}

}
