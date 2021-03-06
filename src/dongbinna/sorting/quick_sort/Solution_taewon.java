package dongbinna.sorting.quick_sort;

import java.util.*;

public class Solution_taewon {

	/*
	 * 
	 */
	public Solution_taewon() {
		// TODO Auto-generated constructor stub
	}
	
	public void quickSort(int[] arr, int start, int end) {
		
		if(start >= end) return;
		int pivot = start;
		int left = start + 1;
		int right = end;
		
		while(left <= right) {
			
			//find number greater than pivot
			while(left <= end && arr[left] <= arr[pivot]) left++;
			
			//find number less than pivot
			while(right > start && arr[right] >= arr[pivot]) right--;
			
			//keep swapping until all numbers have been swapped 
			if(left > right) {
				int temp = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = temp;
			} else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				
			}
		}
		
		quickSort(arr, start, right - 1);
		quickSort(arr, right + 1, end);
		
	}
	
	public static void main(String[] args) {
		Solution_taewon solution = new Solution_taewon();
		int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		solution.quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
