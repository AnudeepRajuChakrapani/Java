package com.strings;

public class ispalindrom {

	public static void main(String[] args) {
		String s1="malayalam";
		String bigpalindrom="";
		for (int i=0;i<s1.length();i++)
		{
			for(int j=i+2;i<s1.length()-1;j++)
			{
				if(ispalindrom(s1,i,j))
				{
					String s2=s1.substring(i,j+1);
					if(s2.length()>bigpalindrom.length())
					{
						bigpalindrom=s2;
					}
				}
				
			}
		}

	}

	private static boolean ispalindrom(String s1, int start, int end) {
int i=start;
 int j=end;
 while(i<j)
 {
	 if(s1.charAt(i)!=s1.charAt(j))return false;
	 i++;
	 j--;
	 
 }
		return true;
	}

}
