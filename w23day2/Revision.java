package w23day2;

public class Revision {
	public static void main(String[] args) {
		System.out.println(smallest());
	}
	
	public static int smallest() {
		boolean bool = false;
		int x = 2520;
		int y;
		
		while(!bool) {
			x++;
			y=0;
			for(int i =1; i<=20; i++) {
				if(x%i==0) {
					y++;
				}
			}
			if(y==20) {
				bool = true;
			}

		}
		return x;
	}

}
