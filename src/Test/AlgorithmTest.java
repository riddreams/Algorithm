package Test;

import algorithm.*;
import org.junit.Test;

/**
 * @author lwyan on 2018-10-29 10:11
 */
public class AlgorithmTest {
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

	@Test
	public void testMyStack(){
		MyStack<Integer> myStack = new MyStack<>();
		System.out.println("isEmpty:"+myStack.isEmpty()+",size:"+myStack.size());
		for (int i=0;i<10;i++){
			myStack.push(i);
		}
		System.out.println("isEmpty:"+myStack.isEmpty()+",size:"+myStack.size());
		while (!myStack.isEmpty()){
			System.out.println(myStack.pop());

		}
	}

	@Test
	public void testMyQueue(){
		MyQueue<Integer> myQueue = new MyQueue<>();
		System.out.println("isEmpty:"+myQueue.isEmpty()+",size:"+myQueue.size());
		for (int i=0;i<10;i++){
			myQueue.enqueue(i);
		}
		System.out.println("isEmpty:"+myQueue.isEmpty()+",size:"+myQueue.size());
		while (!myQueue.isEmpty()){
			System.out.println(myQueue.dequeue());

		}
	}
}