package sort;

/**
 * 归并排序
 * @author lwyan on 2018-10-31 11:49
 */
public class MergeSort {

	public static void mergeSort(int[] arr){
		int[] temp = new int[arr.length];
		sort(temp, arr,0,arr.length-1);
	}
	public static void sort(int[] temp,int[] arr, int low, int high){
		if(high <= low) return;
		int mid = (low+high)/2;
		sort(temp, arr, low, mid);
		sort(temp, arr,mid+1, high);
		merge(temp, arr, low, mid, high);
	}
	// 原地归并
	private static void merge(int[] temp,int[] arr,int low,int mid,int high){
		int i = low;
		int j = mid+1;
		for(int k=low;k<=high;k++){
			temp[k] = arr[k];
		}
		for(int k=low;k<=high;k++){
			if(i>mid){
				arr[k] = temp[j++];
			}else if(j>high){
				arr[k] = temp[i++];
			}else if(temp[j]<temp[i]){
				arr[k] = temp[j++];
			}else{
				arr[k] = temp[i++];
			}
		}
	}
}