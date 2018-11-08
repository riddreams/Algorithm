package algorithm;

/**
 * 最大连续子序列和
 * 时间复杂度：线性O(N)
 * 思想：如果arr[i]是负的，那么它不可能代表最优子序列的起点，从而任何负的子序列也不可能是最优子序列的前缀
 * @author lwyan on 2018-11-08 10:44
 */
public class MaxSubSum {
	public static int maxSubSum(int[] arr){
		int maxSum = 0;
		int thisSum = 0;
		for(int i=0;i<arr.length;i++){
			thisSum += arr[i];
			if(thisSum > maxSum){
				maxSum = thisSum;
			}else if(thisSum<0){// 负的子序列不可能是最优子序列的前缀
				thisSum = 0;
			}
		}
		return maxSum;
	}
	public static void main(String[] args){
		int[] arr = {4,-3,5,-2,-1,2,6,-2};
		System.out.println("最大连续子序列和："+maxSubSum(arr));
	}
}