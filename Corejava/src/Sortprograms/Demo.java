package Sortprograms;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Circle [] arr= { new Circle(20),
		                 new Circle(50),
		                 new Circle(30),
		                 new Circle(10),
		                 new Circle(40),
		};
		Arrays.sort(arr);
		for(Circle c:arr)
		{
			System.out.println(c);
		}
                      
	}

}
