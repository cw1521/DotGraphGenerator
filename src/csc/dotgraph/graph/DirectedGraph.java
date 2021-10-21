package csc.dotgraph.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class DirectedGraph extends Graph {
	
	public DirectedGraph(String name) {
		f_name = name;
		f_nodes = new ArrayList<Node>();
		f_connections = new HashMap<Node, ArrayList<Node>>();
	}
	
	@Override
	public void addNode(Node node) {
		f_nodes.add(node);		
	}
	
	@Override
	public void addConnection(Node node1, Node node2) {
		ArrayList<Node> nodes = f_connections.get(node1);
		if (nodes != null) {
			nodes.add(node2);
			f_connections.put(node1, nodes);
		}
		else {
			nodes = new ArrayList<Node>();
			nodes.add(node2);
			f_connections.put(node1, nodes);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		Set<Node> connKeys = f_connections.keySet();
		strBuilder.append("digraph "+f_name+" {");
		
		for (Node node : f_nodes) {
			strBuilder.append(node.toString()+"\n\t");
		}
		
		for (Node node : connKeys) {
			ArrayList<Node> connList = f_connections.get(node);
			for (int i = 0; i<connList.size(); i++) {
				Node conn = connList.get(i);
				strBuilder.append("\n\t"+node.getName()+" -> "+conn.getName()+";");
			}
		}
		strBuilder.append("\n}\n");
		return strBuilder.toString();
	}

}
