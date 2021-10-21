package csc.dotgraph.graph;

import java.util.ArrayList;
import java.util.Map;

public abstract class Graph {
	protected String f_name;
	protected ArrayList<Node> f_nodes;
	protected Map<Node, ArrayList<Node>> f_connections;
	
	public abstract void addNode(Node node);
	public abstract void addConnection(Node node1, Node node2);
	public abstract String toString();
}
