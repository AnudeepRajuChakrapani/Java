package Numberprograms;

import java.util.Scanner;

public class strongnumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			 int fact=1;
			 for(int i=1;i<=rem;i++)
			 {
				 fact=fact*i;
			 }
			 sum=sum+fact;
			 num=num/10;
		}
		if(sum==temp)
			System.out.println("Strong number");
		else
			System.out.println("not a strong number");
			s.close();
		}
	}


