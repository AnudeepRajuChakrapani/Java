package patterns;

public class Test3 {

	public static void main(String[] args) {
		int n=5;
		int stars=1;
		int spaces=4;
				for(int i=1;i<=n;i++)
				{
					int k=i;
						for(int j=1;j<=spaces;j++)
							System.out.print(" ");
					for(int j=i;i>=1;j--)
					{
						if(j<=stars/2)
						{
							System.out.print(j);
						}
						else
						{
							System.out.print(k);
							k++;
							spaces--;
							stars++;
						}
					}
				}
	}

}
