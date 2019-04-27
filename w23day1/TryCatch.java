package w23day1;

public class TryCatch {
	public static void main(String args[]) {
		int[] x = {1,2,3};
		try {
			System.out.println(x[4]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println("h");
	}
}