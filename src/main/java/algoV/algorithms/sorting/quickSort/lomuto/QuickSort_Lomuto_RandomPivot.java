package algoV.algorithms.sorting.quickSort.lomuto;

import java.util.Random;

import algoV.algorithms.sorting.quickSort.QuickSort;

public class QuickSort_Lomuto_RandomPivot extends QuickSort {
	
	static int n = 7;
	static int[] arrayToSort = new int[n];
	
	static Random rand = new Random();

	public static void analyze() { 
		System.out.println("    QuickSort_RandomPivot");
		
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
	        
	        // More detailes for sorting
			/*
			System.out.println("Array before:");
			printArray(arrayToSort);
			System.out.println();
			*/
	        
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	}
	
	// Lomuto`s partition scheme
	static int partition(int[] arr, int low, int high) {
		random(arr, low, high);
	    int pivot = arr[high];
	    int i = (low - 1);
	 
	    for(int j = low; j <= high - 1; j++) {
	        if (arr[j] < pivot) {
	            i++;
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	
	static void random(int[] arr, int low, int high) {
        int pivot = rand.nextInt(high-low)+low;
        swap(arr, pivot, high);
	}
}
