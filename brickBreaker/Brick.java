package brickBreaker;

import apcs.Window;

public class Brick {
	int width = Window.width()/10;
	int height = Window.height()/30;
	int x;
	int y;
	boolean alive = true;
	
	public Brick(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		if(alive==true) {
			Window.out.rectangle(x, y, width, height);
		}
	}
	

}