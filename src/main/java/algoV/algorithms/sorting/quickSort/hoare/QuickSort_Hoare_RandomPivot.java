package algoV.algorithms.sorting.quickSort.hoare;

import algoV.algorithms.sorting.quickSort.QuickSort;

public class QuickSort_Hoare_RandomPivot extends QuickSort {
	
	static int n = 7;
	static int[] arrayToSort = new int[n];
	
	public static void analyze() { 
		System.out.println("    QuickSort_Hoare_Random_Pivot");
		
		//fillArray(arrayToSort);
		fillArraySimple(arrayToSort);
			
		System.out.println("Array before:");
		printArray(arrayToSort);
		
		quickSort(arrayToSort, 0, n-1);
		
		System.out.println("Array after:");
		printArray(arrayToSort);
		System.out.println();
	}
	
	static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
 
            quickSort(arr, low, pi);
            quickSort(arr, pi + 1, high);
        }
    }
	
	static int partition(int[] arr, int low, int high) {
		int rIndex = (low) + (int)(Math.random() * (high - low + 1));
        swap(arr, low, rIndex);
		
        int pivot = arr[low];
        int i = low - 1, j = high + 1;
 
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
 
            do {
                j--;
            } while (arr[j] > pivot);
 
            if (i >= j)
                return j;
            swap(arr, i, j);
        }
	}
}
