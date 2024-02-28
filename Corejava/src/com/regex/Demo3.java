package com.regex;
import java.util.regex.*;
public class Demo3 {

	public static void main(String[] args) {
     String s="abnaubsjgdwk";
     String exp="a.n";
     Pattern p=Pattern.compile(s);
     Matcher m=p.matcher(s);
     while(m.find())
     {
    	 System.out.println(m.start());
    	 System.out.println(m.group());
    	 System.out.println(m.end());
     }

	}

}
