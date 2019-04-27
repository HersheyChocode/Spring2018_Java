package w21day1;

public abstract class Shapes {
	
	int x, y;
	public Shapes() {System.out.println("Shape created...");}
	
	public abstract int area();
	
	public abstract int perimeter();
}