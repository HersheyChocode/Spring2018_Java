package brickBreaker;

import apcs.Window;

public class Shooter {
	int x = Window.width()/2;
	int y = Window.height()/8*7;
	int width = Window.width()/8;
	int height = Window.height()/30;
	
	public Shooter() {
	}
	public void draw() {
		Window.out.rectangle(x, y, width, height);
		
	}
	public void move() {
		if (Window.key.pressed("right")&&x+width/2<Window.width()) {
			x+=10;
		}
		
		if (Window.key.pressed("left")&&x-width/2>0) {
			x-=10;			
		}
	}

}