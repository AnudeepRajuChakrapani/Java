package com.strings;

public class Occrance {

	public static void main(String[] args) {
		String s="aaabbbccdd";
		
		String s2=" ";
		while(s.length()>0)
		{

			char  ch1=s.charAt(0);
			
			s2=s.replace(ch1+"","");
			
			int count=s.length()-s2.length();
		
			System.out.println(ch1+"="+count);
			s=s2;
		}
		
	}
}

