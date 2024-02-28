package Numberprograms;

public class Palindromenumber {

	public static void main(String[] args) {
		int num=121;
		int temp=num;
		int rev=0;
		while(num!=0)
		{
			int rem = num%10;
		    rev = rev*10+rem;
		    num/=10;
		}
		if(temp==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println(" not palindrome");	
		}
	}

}
