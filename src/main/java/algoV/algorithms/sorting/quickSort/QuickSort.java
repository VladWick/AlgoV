package algoV.algorithms.sorting.quickSort;

import algoV.algorithms.sorting.Sort;

public class QuickSort extends Sort {
	
	public static void fillArraySimple(int[] array) {
		array[0] = 10;
		array[1] = 80;
		array[2] = 30;
		array[3] = 90;
		array[4] = 40;
		array[5] = 50;
		array[6] = 70;
	} 
	
	public static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
}
