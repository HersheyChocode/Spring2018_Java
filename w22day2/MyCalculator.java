package w22day2;
public class MyCalculator implements AdvancedArithmetic{

	@Override
	public int divisorSum(int n) {
		// TODO Auto-generated method stub		
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			if (n%i==0){
				sum+=i;
			}
		}
		return sum;
	}

}