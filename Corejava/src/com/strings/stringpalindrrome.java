package com.strings;

public class stringpalindrrome {
	static boolean ispalindrome(String s)
	{
		s=s.toLowerCase();
		int i=0;int j = s.length()-1;
		while(i<j)
			if(s.charAt(i)!=s.charAt(j))
				return false;
		i++;
		j--;
		return true;
		
	}

	public static void main(String[] args) {
	System.out.println("radae");	
	}

}
