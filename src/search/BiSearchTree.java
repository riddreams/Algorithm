package search;

/**
 * 二叉查找树BST
 * @author lwyan on 2018-11-02 11:51
 */
public class BiSearchTree<Key extends Comparable<Key>,Value> {
	private Node root;

	// 结点可以存放键值对
	private class Node{
		private Key key;
		private Value value;
		private Node left,right;
		private int size;
		public Node(Key key,Value value,int size){
			this.key = key;
			this.value = value;
			this.size = size;
		}
	}

	public int size(){
		return size(root);
	}

	private int size(Node node){
		if(node == null){
			return 0;
		}else{
			return node.size;
		}
	}

	public Value get(Key key){
		return get(root,key);
	}

	// 查找
	private Value get(Node node, Key key) {
		if(node == null){
			return null;
		}
		int cmp = key.compareTo(node.key);
		if(cmp < 0){
			return get(node.left,key);
		}else if(cmp > 0){
			return get(node.right,key);
		}else{
			return node.value;
		}

	}

	public void put(Key key,Value value){
		root = put(root,key,value);
	}

	// 添加
	private Node put(Node node, Key key, Value value) {
		if(node == null){
			return new Node(key,value,1);
		}
		int cmp = key.compareTo(node.key);
		if(cmp < 0){
			node.left = put(node.left,key,value);
		}else if(cmp > 0){
			node.right = put(node.right,key,value);
		}else{
			node.value = value;
		}
		node.size = size(node.left) + size(node.right) + 1;
		return node;
	}

	// 最小键
	public Key min(){
		return min(root).key;
	}

	private Node min(Node node) {
		if(node.left == null){
			return node;
		}else{
			return  min(node.left);
		}
	}

	// 排名为k的键：选择问题
	public Key select(int k){
		return select(root,k).key;
	}

	private Node select(Node node, int k) {
		if(node == null){
			return null;
		}
		int t = size(node.left);
		if(t > k){
			return select(node.left,k);
		}else if(t < k){
			 return select(node.right,k-t-1);
		}else{
			return node;
		}
	}

	// 中序遍历
	public void InOrder(){
		order(root);
	}

	private void order(Node node) {
		if(node == null){
			return;
		}
		order(node.left);
		System.out.println(node.key);
		order(node.right);
	}
}