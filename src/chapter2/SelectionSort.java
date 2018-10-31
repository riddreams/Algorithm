package chapter2;

/**
 * 选择排序
 * @author lwyan on 2018-10-31 9:45
 */
public class SelectionSort {
	public static void selectionSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[minIndex]){
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
}