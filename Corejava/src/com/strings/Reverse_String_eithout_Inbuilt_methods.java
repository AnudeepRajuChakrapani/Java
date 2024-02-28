package com.strings;

public class Reverse_String_eithout_Inbuilt_methods {

	public static void main(String[] args) {
		String s1="java is easy";
		char[]a=s1.toCharArray();
		String s2="";
		int i=0,j=0;
		while(i<a.length) {
			while(j<a.length && a[j]!=' ')j++;
			String t="";
			int k=j-1;
			while(k>=i) {
				t+=a[k];
				k--;
			}
			s2+=t;
			if(j<a.length)s2+=" ";
			i++;
			j--;
			
			}
			System.out.println(s2);
	}
}

