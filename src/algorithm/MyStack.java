package algorithm;

/**
 * 栈
 * @author lwyan on 2018-10-30 11:33
 */
public class MyStack<Item>{
	private Node top;
	private int size;
	private class Node{
		Item item;
		Node next;
	}

	public boolean isEmpty(){
		return top == null;
	}

	public int size(){
		return size;
	}

	public void push(Item item){
		Node oldTop = top;
		top = new Node();
		top.item = item;
		top.next = oldTop;
		size++;
	}

	public Item pop(){
		Item item = top.item;
		top = top.next;
		size--;
		return item;
	}
}