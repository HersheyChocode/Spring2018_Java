package w18day1;

public class Recursion {
	public static void main(String[] args) {
		//System.out.print(fib(6550));
		int[] nums = {1,2,3,4,5,6,7,8,9};
		System.out.print(binarySearch(nums, 4));


	}

	public static long fib(int n) {
		long [] mem = new long[n];
		mem[0] = 1;
		mem[1] =1;
		return fib(n, mem);
	}

	public static long fib(int n, long[] mem) {

		if(n>=0 && mem[n-1]==0) {
			mem[n-1] = fib(n-1, mem) + fib(n-2, mem);
		}
		return mem[n-1];

		//return fib(n-1, mem) + fib(n-2, mem);

	}

	public static int binarySearch(int[] nums, int target){
		return binarySearch(nums, target, 0, nums.length - 1);
	}
	public static int binarySearch(int[] nums, int target, int low, int high) {
		if(low<high) {
			int mid = (low+high)/2;
			if(nums[mid] == target) return mid;
			if(nums[mid] >target) binarySearch(nums,target,low,mid-1);
			if(nums[mid]<target) binarySearch(nums,target,mid+1,high);
		}
		return -1;
	}
}