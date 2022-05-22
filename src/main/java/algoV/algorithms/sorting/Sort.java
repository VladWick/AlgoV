package algoV.algorithms.sorting;

import java.util.Random;

import algoV.algorithms.sorting.bubbleSort.BubbleSort;
import algoV.algorithms.sorting.insertionSort.InsertionSort;
import algoV.algorithms.sorting.mergeSort.MergeSort;
import algoV.algorithms.sorting.quickSort.hoare.QuickSort_Hoare_FirstPivot;
import algoV.algorithms.sorting.quickSort.hoare.QuickSort_Hoare_RandomPivot;
import algoV.algorithms.sorting.quickSort.lomuto.QuickSort_Lomuto_FirstPivot;
import algoV.algorithms.sorting.quickSort.lomuto.QuickSort_Lomuto_LastPivot;
import algoV.algorithms.sorting.quickSort.lomuto.QuickSort_Lomuto_RandomPivot;
import algoV.algorithms.sorting.selectionSort.SelectionSort;

public class Sort {
	
	static Random random = new Random();
	static int lowerBound = -10;
	static int upperBound = 10;
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; ++i) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void fillArray(int[] array) {
		for(int i = 0; i < array.length; ++i) {
			array[i] = random.nextInt(lowerBound, upperBound);
		}
	}
	
	public static void sorting() {
		
		SelectionSort.analyze();
		BubbleSort.analyze();
		InsertionSort.analyze();
		
		MergeSort.analyze();
		
		QuickSort_Lomuto_LastPivot.analyze();
		QuickSort_Lomuto_FirstPivot.analyze();
		QuickSort_Lomuto_RandomPivot.analyze();
		
		QuickSort_Hoare_FirstPivot.analyze();
		QuickSort_Hoare_RandomPivot.analyze();
		
	}
}
