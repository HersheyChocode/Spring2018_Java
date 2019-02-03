package w16day1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums = new int[1000];
		for(int i = 0; i<nums.length; i++) {
			double x = Math.random()*500;
			nums[i] = (int) x;
		}
		SelectionSort(nums);
		for(int i = 0; i<nums.length;i++) {
			System.out.println(nums[i]+" ");
		}
		/*Scanner scan = new Scanner(System.in);
		System.out.println("enter target value");
		int target = scan.nextInt();
		System.out.println("\n"+binarySearch(nums, target));*/
		System.out.println(binarySearch(nums,6));
	}
	public static void SelectionSort(int[] arr) {
		int min = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[min] > arr[j]) {
					int temp = arr[min];
					arr[min] = arr[j];
					arr[j]=temp;
				}
			}
			min++;
		}
	}

	public static int binarySearch(int[] arr, int target) {
		//mid = (low+high)/2
		int low = 0;
		int high = arr.length - 1;
		int mid;
		while(low < high) {
			mid = (low+high)/2;
			if(mid == target) return mid;
			if(target < arr[mid]) high = mid - 1;
			if(target>arr[mid]) low = mid +1;
		}
		return -1;
	}

}