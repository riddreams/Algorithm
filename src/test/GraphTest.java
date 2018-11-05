package test;

import graph.DepthFirstSearch;
import graph.Graph;
import org.junit.Test;

/**
 * @author lwyan on 2018-11-05 10:03
 */
public class GraphTest {
	@Test
	public void testGraph(){
		Graph graph = new Graph(5);
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(0,3);
		graph.addEdge(1,2);
		graph.addEdge(2,3);
		graph.addEdge(3,4);
		System.out.println("V: "+graph.countV());
		System.out.println("E: "+graph.countE());
		System.out.println("0的所有相邻顶点: "+graph.adj(0));
		DepthFirstSearch depthFirstSearch = new DepthFirstSearch(graph,0);
		System.out.println("\n"+depthFirstSearch.count());
	}
}