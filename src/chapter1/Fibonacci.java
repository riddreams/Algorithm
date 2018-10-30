package chapter1;

/**
 * Fibonacci数列
 * @author lwyan on 2018-10-29 11:27
 */
public class Fibonacci {
	// 递归方法
	public static long recursiveFibonacci(int n){
		if(n == 0 || n==1){
			return n;
		}else{
			return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
		}
	}
	// 循环方法
	public static long loopFibonacci(int n){
		long f = 0;
		long g = 1;
		for(int i=0;i<n;i++){
			f = f + g;
			g = f - g;
		}
		return f;
	}
}