package com.strings;

public class OccranceOfEach {

	public static void main(String[] args) {
		String s1="malayalam";
		char []ch=s1.toCharArray();
		String s2="";
		int max=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;i<ch.length;j++)
			{
				if(ispalindrome(s1,i,j+1))
				{
					String s2=s1.substring(i,j);
				}
			}
			
		}

	}

	private static boolean ispalindrome(String s1, int i, int j) {

		return false;
	}

}
