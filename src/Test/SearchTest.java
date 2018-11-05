package Test;

import search.BiSearchTree;
import org.junit.Test;

/**
 * @author lwyan on 2018-11-02 11:56
 */
public class SearchTest {
	@Test
	public void testBiSearchTree(){
		BiSearchTree<String,String> biSearchTree = new BiSearchTree<>();
		System.out.println("size: "+biSearchTree.size());
		biSearchTree.put("algorithm","important");
		System.out.println("size: "+biSearchTree.size());
		System.out.println("algorithm: "+biSearchTree.get("algorithm"));
		System.out.println("coding: "+biSearchTree.get("coding"));
		biSearchTree.put("coding","important too");
		biSearchTree.put("thought","also important");
		System.out.println("size: "+biSearchTree.size());
		System.out.println("coding: "+biSearchTree.get("coding"));
		System.out.println("thought: "+biSearchTree.get("thought"));
		System.out.println("min: "+biSearchTree.min());
		System.out.println("second key: "+biSearchTree.select(1));
		biSearchTree.InOrder();
	}
}