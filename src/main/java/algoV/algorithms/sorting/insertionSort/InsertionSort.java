package algoV.algorithms.sorting.insertionSort;

import algoV.algorithms.sorting.Sort;

public class InsertionSort extends Sort {
	
	static int n = 100;
	static int[] arrayToSort = new int[n];
	
	public static void analyze() {
		System.out.println("    Insertion sort");
		fillArray(arrayToSort);
			
		System.out.println("Array before:");
		printArray(arrayToSort);
		
		insertionSort(arrayToSort, n);
		
		System.out.println("Array after:");
		printArray(arrayToSort);
		System.out.println();
	}
	
	static void insertionSort(int arr[], int n) {
	    int i, key, j;
	    for (i = 1; i < n; i++) {
	        key = arr[i];
	        j = i - 1;
	 
	        while (j >= 0 && arr[j] > key) {
	            arr[j + 1] = arr[j];
	            j = j - 1;
	        }
	        arr[j + 1] = key;
	    }
	}
}
