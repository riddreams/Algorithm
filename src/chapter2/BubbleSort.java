package chapter2;

/**
 * 冒泡排序
 * @author lwyan on 2018-10-31 10:46
 */
public class BubbleSort {
	public static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=arr.length-1;j>i;j--){
				if(arr[j]<arr[j-1]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}