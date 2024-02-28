package com.multithreading;

public class Demo4  extends Thread {
	public void run() {
		for(int i=0;i<40;i++) 
			System.out.println(" inside");
		System.out.println("Outside");
		}
	public static void main(String[] args) {
		Demo4 a=new Demo4();
		a.run();
		a.start();
		for(int i=37;i<80;i++)
			System.out.println("MAIN");
	}		
	}

