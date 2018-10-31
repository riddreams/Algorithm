package chapter2;

/**
 * 快速排序
 * @author lwyan on 2018-10-31 12:28
 */
public class QuickSort {
	public static void quickSort(int[] arr){
		qSort(arr, 0, arr.length-1);
	}

	private static void qSort(int[] arr, int low, int high) {
		if(high <= low) return;
		int i = low;
		int j = high;
		int key = arr[low];
		while (i<j){
			while(arr[j]>=key && i<j){
				j--;
			}
			arr[i] = arr[j];
			while(arr[i]<=key && i<j){
				i++;
			}
			arr[j] = arr[i];
		}
		arr[i] = key;
		qSort(arr, low, i-1);
		qSort(arr, i+1, high);
	}
}