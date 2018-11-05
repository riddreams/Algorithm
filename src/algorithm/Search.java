package algorithm;

/**
 * 查找
 * @author lwyan on 2018-10-29 10:23
 */
public class Search {
	// 二分查找
	public static int binarySearch(int[] arr, int key){
		int low = 0;
		int high = arr.length - 1;
		while(low <= high){
			int mid = (low + high)/2;
			if(key > arr[mid]){
				low = mid + 1;
			}else if(key < arr[mid]){
				high = mid - 1;
			}else{
				return mid;
			}
		}
		return -1;
	}
}