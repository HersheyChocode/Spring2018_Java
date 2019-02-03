package w17day1;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums = new int[100];
		for(int i = 0; i<nums.length; i++) {
			double x = Math.random()*100;
			nums[i] = (int) x;
		}
		/*SelectionSort(nums);
		for(int i = 0; i<nums.length;i++) {
			System.out.println(nums[i]+" ");
		}*/
		for(int i = 0; i<nums.length;i++) {
			System.out.println(nums[i]+" ");
		}
		InsertionSort(nums);
		System.out.println("NEw \n");
		for(int i = 0; i<nums.length;i++) {
			System.out.println(nums[i]+" ");
		}
		/*Scanner scan = new Scanner(System.in);
		System.out.println("enter target value");
		int target = scan.nextInt();
		System.out.println("\n"+binarySearch(nums, target));*/
		System.out.println("binary" + binarySearch(nums,6));
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
	public static void InsertionSort(int[] arr) {
		for(int i = 1; i <arr.length; i++) {
			int j = i;
			while(j>0&&arr[j]<arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j = j-1;

			}
		}
		
	}

}