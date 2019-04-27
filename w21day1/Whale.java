package w21day1;

import apcs.Window;

public class Whale extends Organism {
	double dx = 2;
	double dy = Window.random(-5, 5);
	int angle = Window.random(-180, 180);
	double width = Window.width()/4;
	double height = Window.height()/8;
	public Whale() {
		x = Window.random((int)width, (int) (Window.width()-width));
		y = Window.random((int)height, (int) (Window.height()-height));
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		x += dx;
		y += dy;
		angle+=1;
		if(x+width/2>=Window.width()||x-width/2<=0) {
			dx = -dx;
		}

		if(y+height/2>=Window.height()||y-height/2<=0) {
			dy = -dy;
		}
		draw();
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		if (alive==true) {
			Window.out.color(r,g,b);
			Window.out.rectangle(x, y, (int)width, (int)height, angle);
		}
	}


	@Override
	public void grow() {
		// TODO Auto-generated method stub
		width +=0.1;
		height += 0.1;
	}

	@Override
	public void eat(Organism o) {
		// TODO Auto-generated method stub
		o.die();
		grow();
	}
}
