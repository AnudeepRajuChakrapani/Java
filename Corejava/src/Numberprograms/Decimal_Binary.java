package Numberprograms;

public class Decimal_Binary {

	public static void main(String[] args) {
	 int num=56;
	 int i=1;
	  int bin=0;
	  while(num<0) {
		  int rem=num%2;
		  bin=bin+rem*i;
		  i=i*10;
		  num/=2;
	  }
	  System.out.println(bin);

	}

}
