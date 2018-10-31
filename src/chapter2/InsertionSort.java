package chapter2;

/**
 * 插入排序
 * @author lwyan on 2018-10-31 9:59
 */
public class InsertionSort {
	public static void insertionSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int j = i;
			int temp = arr[i];
			while (j>0 && temp<arr[j-1]){
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}
}