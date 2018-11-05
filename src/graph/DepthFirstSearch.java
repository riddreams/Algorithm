package graph;

/**
 * 深度优先搜索
 * @author lwyan on 2018-11-05 10:24
 */
public class DepthFirstSearch {
	private boolean[] marked;
	private int count;
	public DepthFirstSearch(Graph G,int s){
		marked = new boolean[G.countV()];
		dfs(G,s);
	}

	private void dfs(Graph G, int v) {
		System.out.print(v+" ");
		marked[v] = true;
		count++;
		for(int w : G.adj(v)){
			if(!marked(w)){
				dfs(G,w);
			}
		}
	}
	public boolean marked(int w){
		return marked[w];
	}
	public int count(){
		return count;
	}
}