package Numberprograms;

public class xylenaondphloem {

	public static void main(String[] args) {
		int n=31233;
		int temp=n;
		int inner_num=0;//3+3+2+1=9
		int outer_num=0;//6+3=9
		while(n>0)
		{
			if(temp==n||n<10)
			outer_num+=n%10;
			else
			inner_num+=n%10;
				n/=10;
		}
		if(inner_num == outer_num)
			System.out.println("Xylam");
			else {
				System.out.println("pholem");
			}
	}
}
