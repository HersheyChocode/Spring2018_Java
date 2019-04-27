package w21day1;

import apcs.Window;

public abstract class Organism {
	
	int x, y;
	int distance;
	int r, g, b;
	
	boolean alive = true;
	
	public Organism() {
		x = Window.random(0, Window.width());
		y = Window.random(0,Window.height());
		
		r = Window.random(0, 0);
		g = Window.random(100,255);
		b = Window.random(100, 200);

		
	}
	
	public Organism(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void move();
	public abstract void draw();
	public abstract void eat(Organism o);
	public abstract void grow();
	
	public void die() {
		alive = false;
	}
	
	public int getDistance(Organism other) {
		int xDist = other.x - x;
		int yDist = other.y -y;
		distance = (int)Math.sqrt(xDist*xDist + yDist*yDist);
		return (distance);
	}

}
