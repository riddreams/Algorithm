package Test;

import chapter1.Evaluate;
import chapter1.Fibonacci;
import chapter1.Gcd;
import chapter1.Search;
import org.junit.Test;

/**
 * @author lwyan on 2018-10-29 10:11
 */
public class Chapter1Test {
	@Test
	public void testGcd(){
		System.out.println(Gcd.gcd(4,6));
	}

	@Test
	public void testSearch(){
		int arr[] = {0,1,2,3,4,5,6,7,8,9};
		int key = 5;
		System.out.println(Search.binarySearch(arr, key));
	}

	@Test
	public void testFibonacci(){
		int n = 24;
		System.out.println(Fibonacci.recursiveFibonacci(n));
		System.out.println(Fibonacci.loopFibonacci(n));
	}

	@Test
	public void testEvaluate(){
		String[] express = {"(", "1", "+", "(", "(", "2", "+", "3", ")", "*", "(", "4", "*", "5", ")", ")", ")"};
		System.out.println(Evaluate.doubleStackEvaluate(express));
	}
}