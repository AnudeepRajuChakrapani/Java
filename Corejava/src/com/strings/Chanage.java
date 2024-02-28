package com.strings;

public class Chanage {

	public static void main(String[] args) {
		String s1="JaVa iS EasY";
	char[]chars=s1.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
			char ch1=chars[i];
			if(ch1>='A'&& ch1<='Z')
				chars[i]=(char)(ch1+32);
			else
				if(ch1>='a'&& ch1<='z')
					chars[i]=(char)(ch1-32);
		}
		System.out.println(chars);

	}

}
