package Funny_Programs;

 abstract class parent {
	
	 abstract public void method1();
	   abstract public void method2();
	   
	   public static void main(String args[]){
	}

	abstract class Child extends parent{
	   public void method2(){
	       System.out.println("Method2 is implemented");
	   }

	   public void method3(){
	       System.out.println("Method3 in the child class");
	   }	
	}

}
