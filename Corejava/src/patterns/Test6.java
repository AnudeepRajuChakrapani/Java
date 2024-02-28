package patterns;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int stars=1;
int n=5;
int spaces=n-1;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=spaces;j++)
	{
		System.out.print(" ");
	}
	for(int j=stars;j>=1;j--)
	{
		System.out.print(j);
	}
	System.out.println();
	stars++;
	spaces--;
	}
}
	}

