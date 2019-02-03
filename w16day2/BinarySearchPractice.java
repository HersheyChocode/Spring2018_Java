package w16day2;

public class BinarySearchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7,8,9};
		System.out.print(check(array, 5));

	}
	
	public static int check(int[] arr, int num) {
		int high = arr.length -1 ;
		int low = 0;
		int mid; 
		while(low<high) {
			mid = low+high/2;
			if(num == arr[mid]) return mid;
			if(num < mid) high = mid-1;
			if(num > mid) low = mid+1;
		}
		return -1;
	}

}