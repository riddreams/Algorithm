package algorithm;

/**
 * 队列
 * @author lwyan on 2018-10-30 12:11
 */
public class MyQueue<Item> {
	private Node first;
	private Node last;
	private int size;
	private class Node{
		Item item;
		Node next;
	}

	public boolean isEmpty(){
		return first == null;
	}
	public int size() {
		return size;
	}

	public void enqueue(Item item){
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty()){
			first = last;
		}else{
			oldLast.next = last;
		}
		size++;
	}

	public Item dequeue(){
		Item item = first.item;
		first = first.next;
		if(isEmpty()){
			last = null;
		}
		size--;
		return item;
	}
}