package Test;

import chapter2.*;
import org.junit.Test;

/**
 * @author lwyan on 2018-10-31 9:49
 */
public class Chapter2Test {
	@Test
	public void testSelectionSort(){
		int arr[] = {6,-3,0,2,1,7,-9,5};
		SelectionSort.selectionSort(arr);
		for (int anArr : arr) {
			System.out.print(anArr + " ");
		}
	}

	@Test
	public void testInsertionSort(){
		int arr[] = {6,-3,0,2,1,7,-9,5};
		InsertionSort.insertionSort(arr);
		for (int anArr : arr) {
			System.out.print(anArr + " ");
		}
	}

	@Test
	public void testBubbleSort(){
		int arr[] = {6,-3,0,2,1,7,-9,5};
		BubbleSort.bubbleSort(arr);
		for (int anArr : arr) {
			System.out.print(anArr + " ");
		}
	}

	@Test
	public void testShellSort(){
		int arr[] = {6,-3,0,2,1,7,-9,5};
		ShellSort.shellSort(arr);
		for (int anArr : arr) {
			System.out.print(anArr + " ");
		}
	}

	@Test
	public void testMergeSort(){
		int arr[] = {6,-3,0,2,1,7,-9,5};
		MergeSort.mergeSort(arr);
		for (int anArr : arr) {
			System.out.print(anArr + " ");
		}
	}

	@Test
	public void testQuickSort(){
		int arr[] = {6,-3,0,2,1,7,-9,5};
		QuickSort.quickSort(arr);
		for (int anArr : arr) {
			System.out.print(anArr + " ");
		}
	}
}