package com.strings;

public class In_it_cap
{

	public static void main(String[] args) 
	{
		String s="anudeep raju";
		char[]ch=s.toCharArray();
		for(int i=0;i<=ch.length;i++)
		{
			if(i==0||ch[i-1]==' ')
			{
				if(ch[i]>='a'||ch[i]<='z')
				{
					ch[i]=(char)(ch[i]-32);
				}
			}				
		}
		String s1=new String(ch);
		System.out.println(s1);
	}
}
