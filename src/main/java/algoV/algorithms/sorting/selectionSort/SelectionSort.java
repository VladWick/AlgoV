package algoV.algorithms.sorting.selectionSort;

import algoV.algorithms.sorting.Sort;

public class SelectionSort extends Sort {
	static int n = 100;
	static int[] arrayToSort = new int[n];
	
	public static void analyze() { 
		System.out.println("    Selection sort");
		fillArray(arrayToSort);
			
		System.out.println("Array before:");
		printArray(arrayToSort);
		
		selectionSort(arrayToSort);
		
		System.out.println("Array after:");
		printArray(arrayToSort);
		System.out.println();
	}
	
	static void selectionSort(int arr[]){
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
