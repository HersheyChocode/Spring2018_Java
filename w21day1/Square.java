package w21day1;
import apcs.Window;
public class Square extends Shapes{
	int width;
	
	public Square() {
		x = Window.width()/2;
		y = Window.height()/2;
		width = Window.width()/8;
		Window.out.background("green");
		Window.out.color("blue");
		Window.out.square(x, y, width);
	}
	
	public Square(int width) {
		x = Window.width()/2;
		y = Window.height()/2;
		this.width = width;
		Window.out.background("green");
		Window.out.color("blue");
		Window.out.square(x, y, width);
	}

	public int area() {
		// TODO Auto-generated method stub
		return width*width;
	}

	public int perimeter() {
		// TODO Auto-generated method stub
		return width*4;
	}

}