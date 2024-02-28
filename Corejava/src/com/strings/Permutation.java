package com.strings;

public class Permutation {
public static void main(String[] args) {
	display("abcd");
	}
   static void display(String s) {
	for(int i=0;i<=3;i++) {
		String s1=swap(s,0,i);
		
	}
}
	public	static String swap(String s) {
			char []c=s.toCharArray();
			int i=0,j=c.length;
			while(i<j) {
				char temp=c[i];
				c[i]=c[j];
				c[j]=c[i];
			}
			return new String(c);
				
			
		}

	}


