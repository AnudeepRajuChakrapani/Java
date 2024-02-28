package Sortprograms;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		String []arr= {"Raju","krishna","Rowdy"};
				/*new emp("raju",8500),
				new emp("Krishna",5500),
				new emp("man",9500),
		};*/
		Arrays.sort(arr);
		for(String s:arr)
		{
			System.out.println(s);
		}
	}

}
