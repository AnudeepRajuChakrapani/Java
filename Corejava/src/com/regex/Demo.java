package com.regex;

import java.util.regex.*;
public class Demo {

	public static void main(String[] args) {
     String s="abababab";
     String exp="aba";
	Pattern p= Pattern.compile(s);
	Matcher m=p.matcher(exp);
	
	int count=0;
	while(m.find())
	count++;

	System.out.println(exp+"="+count);
	}
}
