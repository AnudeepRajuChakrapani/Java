package Numberprograms;

public class spy_number {

	public static void main(String[] args) {
	int n=22;
	int prod=1;
	int rem=0;
	int sum=0;
	while(n!=0)
	{
		rem=n%10;
		prod=prod*rem;
		sum=sum+rem;
		n/=10;
	}
	if(prod==sum)
	{
	System.out.println("spynumber");
	}
else
	{
		System.out.println("not a spy number");
	}
	}

	}


	
