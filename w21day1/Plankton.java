package w21day1;

import apcs.Window;

public class Plankton extends Organism{
	int width = 2;

	@Override
	public void move() {
		// TODO Auto-generated method stub
		x = x+ Window.random(-2, 1);
		y = y+Window.random(-2, 1);

		if(x+width>=Window.width()) {
			x-=1;
		} if(x-width<=0) {
			x+=1;
		}

		if(y+width>=Window.height()) {
			y-=1;
		} if(y-width<=0) {
			y+=1;
		}
		draw();
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		if (alive) {
			Window.out.color(r,g,b);
			Window.out.circle(x, y, width);
		}
	}


	@Override
	public void grow() {
		// TODO Auto-generated method stub

	}


	@Override
	public void eat(Organism o) {
		// TODO Auto-generated method stub

	}

}