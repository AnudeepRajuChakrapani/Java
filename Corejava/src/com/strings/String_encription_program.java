package com.strings;

public class String_encription_program {

	public static void main(String[] args) {
		String s1="mygsdgakdga";
		int n=29;
		char[] alphabets="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[]chars=s1.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
			int index=chars[i]-'a';
			index=index+(n%26);
			chars[i]=alphabets[index%26];
		}
		String s2=new String(chars);
		System.out.println(s2);
	}
}