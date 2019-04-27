package brickBreaker;

import apcs.Window;

public class Driver {
	public static void main(String[] args) {

		Shooter shooter = new Shooter();
		Brick[][] arr = new Brick[5][10];
		Ball ball = new Ball();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = new Brick(Window.width() / 5 * j + Window.width() / 10, Window.height() / 10 * (i + 1));
			}
		}
		int countDead = 0;
		Window.out.print("Welcome!", Window.width()/2-30, Window.height()/2);
		Window.sleep(1000);
		while (!ball.loss) {
			countDead =0;
			Window.frame();
			Window.out.color("white");
			shooter.draw();
			shooter.move();
			ball.move();
			ball.bounce(shooter);
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < 10; j++) {
					Window.out.randomColor();
					arr[i][j].draw();
					if(arr[i][j].alive==false) {
						countDead+=1;
					}
					ball.hit(arr[i][j]);
				}
			}
			System.out.println(countDead);
			if(countDead==arr[0].length * arr[0].length) {
				ball.win=true;
				break;
			}
		}
		Window.frame();
		if(ball.win) {
			Window.out.print("Congratulations! You won!", Window.width()/2, Window.height()/2);
		} else {		
			Window.out.print("Oh no! You lost!", Window.width()/2-50, Window.height()/2);
		}
		Window.frame();
		
	}
}