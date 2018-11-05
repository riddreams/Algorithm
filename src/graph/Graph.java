package graph;

import java.util.ArrayList;

/**
 * 无向图邻接表实现
 * @author lwyan on 2018-11-05 9:50
 */
public class Graph {
	private final int V;// 顶点数目
	private int E;// 边的数目
	private ArrayList[] adj;// 邻接表
	public Graph(int V){
		this.V = V;
		this.E = 0;
		adj = new ArrayList[V];
		for(int v=0;v<V;v++){
			adj[v] = new ArrayList<>();
		}
	}
	public int countV(){
		return V;
	}
	public int countE(){
		return E;
	}
	public void addEdge(int v,int w){
		adj[v].add(w);
		adj[w].add(v);
		E++;
	}
	public Iterable<Integer> adj(int v){
		return adj[v];
	}
}