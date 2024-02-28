package Numberprograms;

public class fibinosis_series {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3=0;
		 int count = 6;
		for(int i=0;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
