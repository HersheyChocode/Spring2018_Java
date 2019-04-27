package w23day1;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindrome("tacocat"));
	}
	
	public static String reverse(String x) {
		String fin = "";
		for(int i = x.length()-1; i>=0; i--) {
			fin+=x.charAt(i);
		}
		return fin;
	}
	
	public static boolean palindrome(String x) {
		String y = "";
		y+= reverse(x);
		if(x.equals(y)) {
			return true;
		}
		return false;
	}

}
