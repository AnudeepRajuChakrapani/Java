package com.strings;

public class Anagaram {

	public static void main(String[] args) {
		System.out.println(isAnagram("peek","keep"));
	}
	public static boolean isAnagram(String s1,String s2) {
		while(true) {
			if(s1.length()!=s1.length())return false;
			else if(s1.length()==0&&s2.length()==0)return true;
			char c=s1.charAt(0);
			s1=s1.replace(c+"", "");
			s2=s2.replace(c+"","");
			
		}
	
	}

}
