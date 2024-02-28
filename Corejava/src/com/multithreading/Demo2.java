package com.multithreading;

public class Demo2 {

	public static void main(String[] args) {
		Employe e1=new Employe("T1");
	    e1.start();
	    Manager m1=new Manager("T2");
	    m1.start();
	}
	}
	class Employe extends Thread{
		public Employe(String tname) {
		super(tname);
		}
		@Override
		public void run() {
		System.out.println("hello"+Thread.currentThread()+ " "+getName()+">>"+Thread.activeCount());
	}
}
     class Manager extends Thread{
    	 public Manager(String tname) {
    			super(tname);
    	 }
	  @Override
	  public void run() {
		  System.out.println("Raju");
	  }
	
}
