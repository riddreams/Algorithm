package sort;

/**
 * 希尔排序
 * @author lwyan on 2018-10-31 11:22
 */
public class ShellSort {
	public static void shellSort(int[] arr){
		int len = arr.length;
		int step = 1;
		// 确定初始增量
		while (step < len/3){
			step = 3 * step + 1;
		}
		while(step >=1 ){
			// 将数组变为step有序
			for(int i=step;i<len;i++){
				// 将arr[i]插入到arr[i-step],arr[i-2*step]...中
				for(int j=i;j>=step && arr[j]<arr[j-step];j-=step){
					int temp = arr[j];
					arr[j] = arr[j-step];
					arr[j-step] = temp;
				}
			}
			// 改变增量
			step = step/3;
		}
	}
}