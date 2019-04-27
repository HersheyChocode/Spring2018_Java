package brickBreaker;

import apcs.Window;

public class Ball {
	int rad = Window.width() / 100;
	int x = Window.width() / 2;
	int y = Window.height() * 3 / 4;
	int dy = 5;
	int dx = 0;
	boolean loss = false;
	boolean win = false;

	public Ball() {

	}

	public void draw() {
		Window.out.circle(x, y, rad);
	}

	public void move() {
		if(x+rad>=Window.width()||x-rad<=0) {
			dx *= -1;
		} if (y - rad <= 0) {
			dy *= -1;
		} if ( y+ rad>=Window.height()) {
			loss = true;
		}
		y += dy;
		x += dx;
		draw();
	}

	public void bounce(Shooter shooter) {
		if (y + rad >= (shooter.y - shooter.height / 2) && x+rad<=shooter.x + shooter.width && x-rad>= shooter.x-shooter.width) {
			dy *= -1;
			dx += (x - shooter.x)/3;
		}
	}

	public void hit(Brick brick) {

		if ((y - rad <= (brick.y + brick.height / 2) && y - rad >= (brick.y - brick.height/2)) && brick.alive) {
			if (x + rad > brick.x - brick.width / 2 && x - rad < brick.x + brick.width / 2) {
				brick.alive = false;
				dy = dy * -1;
				dx += (x - brick.x)/3;
			}
		}

	}

}