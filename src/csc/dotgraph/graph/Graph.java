package csc.dotgraph.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Graph {
	protected String f_name;
	protected ArrayList<Node> f_nodes;
	protected Map<Node, ArrayList<Node>> f_connections;
	
	public abstract void addNode(Node node);
	public abstract void addConnection(Node node1, Node node2);
	public abstract String toString();
	
	public abstract HashMap<String, ArrayList<String>> getAdjacencyList();
	protected abstract HashMap<String, ArrayList<String>> createAdjacencyList();
	
	public abstract int[][] getAjacencyMatrix();
	protected abstract int[][] createAdjacencyMatrix();
	
	protected abstract ArrayList<String> createVerticesList();
	public abstract ArrayList<String> getVerticesList();
	
}
