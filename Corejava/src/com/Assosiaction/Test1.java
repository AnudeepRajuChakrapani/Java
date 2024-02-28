package com.Assosiaction;
class A
{
	public void m1()
	{
		System.out.println("Hai baby");
	}
}
class B
{
	A a;
	B(A a)
	{
		this.a=a;
	}
	public void m2()
	{
		{
	
		System.out.println("How are you");
		}
	}
	public void m3()
	{
	System.out.println("hai");
	}
}
public class Test1 {

	public static void main(String[] args) {
		B b=new B(new A());
		b.m2();
		b.m3();
	}

}
