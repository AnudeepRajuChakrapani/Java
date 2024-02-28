package com.multithreading;

public class Demo3 {

	public static void main(String[] args) {
				Employe e1=new Employe();
			    e1.start();
			    Manager m1=new Manager();
			    m1.start();
			}
			}
			class Employe extends Thread{
				@Override
				public void run() {
				System.out.println("hello"+Thread.currentThread()+ " "+getName()+">>"+Thread.activeCount());
			}
		}
		     class Manager extends Thread{
			  @Override
			  public void run() {
				  System.out.println("Raju");
			  }
			
		


	}

}
