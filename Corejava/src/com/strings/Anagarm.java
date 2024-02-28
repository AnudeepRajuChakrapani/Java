package com.strings;

public class Anagarm {

	public static boolean main(String[] args) {
		System.out.println(anagaram("silent","listen"));
		return false;
	}
		 public static boolean anagaram(String s1,String s2)
		 {
			 s1=s1.toLowerCase();
			 s2=s2.toLowerCase();			 
		 while(s1.length()==s2.length())
		 {
			 char c=s1.charAt(0);
					 {
						 s1=s1.replace(c+"","");
						 s2=s2.replace(c+"","");
						 
				 
					 }
		 }
		if(s1.length()==0&& s2.length()==0)
			return true;
		else
			return false;
	}

	
}
			
		
	

	
	


