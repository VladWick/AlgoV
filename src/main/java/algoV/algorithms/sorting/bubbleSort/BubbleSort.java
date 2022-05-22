package algoV.algorithms.sorting.bubbleSort;

import algoV.algorithms.sorting.Sort;

public class BubbleSort extends Sort {
	
	static int n = 100;
	static int[] arrayToSort = new int[n];
	
	public static void analyze() { 
		System.out.println("    Bubble sort");
		fillArray(arrayToSort);
			
		System.out.println("Array before:");
		printArray(arrayToSort);
		
		bubbleSort(arrayToSort);
		
		System.out.println("Array after:");
		printArray(arrayToSort);
		System.out.println();
	}
	
	static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
        	for (int j = 0; j < n - i - 1; j++) {
        		if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        	}
        }
    }
}
