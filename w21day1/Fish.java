package w21day1;

import apcs.Window;

public class Fish extends Organism{
	int width;
	int height;
	int dx = 5;
	int dy = Window.random(-5, 5);

	int rotation;
	int change = 1;
	public void draw() {
		// TODO Auto-generated method stub
		if(alive == true) {
			width = Window.width()/25;
			height = width*3/4;
			Window.out.color(r,g,b);
			Window.out.oval(x, y, width, height);
			if(dx>0) {
				int x1 = x - width/2;
				int x2 = x - width;
				int y1 = y;
				int y2 = y -5;
				int y3 = y+5;

				int[]fishx = {x1, x2, x2};
				int[] fishy = {y1,y2,y3};

				Window.out.polygon(fishx, fishy);

				Window.out.color("black");
				Window.out.circle(x+width/4, y, width/8);
			} else {
				int x1 = x + width/2;
				int x2 = x + width;
				int y1 = y;
				int y2 = y -5;
				int y3 = y+5;

				int[]fishx = {x1, x2, x2};
				int[] fishy = {y1,y2,y3};

				Window.out.polygon(fishx, fishy);

				Window.out.color("black");
				Window.out.circle(x-width/4, y, width/8);
			}
		}


	}

	public void eat(Organism o) {
		// TODO Auto-generated method stub
		o.die();
		grow();

	}

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		width+=.5;
		height+=.5;

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		rotation += change;


		x = x + dx;

		y = y + dy;

		if(x+width*1.5>=Window.width()) {
			dx = -5;
		}
		if(x-width*1.5<=0) {
			dx = 5;
		}
		if(y+height*1.5>=Window.height()) {
			dy = Window.random(0, -5);
		}
		if(y-width*1.5<=0) {
			dy = Window.random(0, 5);
		}


		draw();
	}


}