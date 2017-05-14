package afterGoldManRoundOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacencyMatrixGraph implements Graph{
	private int[][] adjacentMatric;
	private GraphType graphtype = GraphType.DIRECTED;
	private int vertices =0;
	
	public  AdjacencyMatrixGraph(int vertices, GraphType graphtype){
			this.vertices = vertices;
			this.graphtype = graphtype;
			adjacentMatric = new int[vertices][vertices];
		for (int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				adjacentMatric[i][i] =0;
			}
		}
	}
	
	@Override
	public void addEdge(int v1,int v2){
		if(v1>vertices || v1<0 || v2> vertices || v2<0 ){
			throw new IllegalArgumentException("The verties are invalid");
		}
		
		adjacentMatric[v1][v2] = 1;
		if(graphtype == GraphType.UNDIRECTED){
			adjacentMatric[v2][v1] = 1;
		}
	}
	@Override
	public List<Integer> getAdjacentVertices(int v){
		if(v>vertices || v<0 ){
			throw new IllegalArgumentException("The verties are invalid");
		}
		List<Integer> adjacentVertices = new ArrayList<>();
		for (int i = 0; i < vertices; i++) {
			if(adjacentMatric[v][i]==1){
				adjacentVertices.add(i);
			}
		}
		Collections.sort(adjacentVertices);
		return adjacentVertices;
	}
	
}
