package Numberprograms;
public class nivennumber {
	public static void main(String[] args) {
		int num = 2;
		int temp = num;
		int rem = 0;
		int sum = 0;
		while(num>0) {
			 rem =num%10;
			sum=sum+rem;
			num/=10;
		}
		if(sum==temp)
		{
			System.out.println("niven");}
			else {
				System.out.println("not");
		}
	}
			
		}
