package Sortprograms;

public class Circle implements Comparable {
   int radius;
	public Circle( int radius) {
		this.radius=radius;
	}
	public String toString()
	{
		return "Circle[radius="+radius+"]";
		
	}
	@Override
	public int compareTo(Object arg) {
		
		return radius-((Circle)arg).radius;
	}

}
