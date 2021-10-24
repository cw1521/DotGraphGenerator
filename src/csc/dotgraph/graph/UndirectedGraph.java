package csc.dotgraph.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UndirectedGraph extends Graph {

	public UndirectedGraph(String name) {
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
	
	private HashMap<String, ArrayList<String>> initializeAdjacencyList() {
		HashMap<String, ArrayList<String>> adjacencyList = new HashMap<String, ArrayList<String>>();
		for (Node node : f_nodes) {
			adjacencyList.put(node.getLabel(), new ArrayList<String>());
		}
		return adjacencyList;
	}
	
	
	@Override
	protected HashMap<String, ArrayList<String>> createAdjacencyList() {
		HashMap<String, ArrayList<String>> adjacencyList = initializeAdjacencyList();
		Set<Node> connKeys = f_connections.keySet();
		
		for (Node key : connKeys) {
			// Get adjacency list for key
			ArrayList<String> adjacentNodes = adjacencyList.get(key.getLabel());
			
			// Get Connection list for key
			ArrayList<Node> nodeConns = f_connections.get(key);
			
			// FOR each node in connection list of key
			for (Node node : nodeConns) {
				// Get adjacency list for node
				ArrayList<String> nodeConnList = adjacencyList.get(node.getLabel());
				
				// IF adjacency list for key does not contain node, add node
				if (!adjacentNodes.contains(node.getLabel())) adjacencyList.get(key.getLabel()).add(node.getLabel());
				
				// If adjacency list for node does not contain key, add key
				if (!nodeConnList.contains(key.getLabel())) adjacencyList.get(node.getLabel()).add(key.getLabel());
			}
		}
		return adjacencyList;
	}
	
	
	@Override
	public HashMap<String, ArrayList<String>> getAdjacencyList() {
		return createAdjacencyList();
	}
	
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		Set<Node> connKeys = f_connections.keySet();
		strBuilder.append("graph "+f_name+" {");
		
		for (Node node : f_nodes) {
			strBuilder.append(node.toString()+"\n\t");
		}
		
		for (Node node : connKeys) {
			ArrayList<Node> connList = f_connections.get(node);
			for (int i = 0; i<connList.size(); i++) {
				Node conn = connList.get(i);
				strBuilder.append("\n\t"+node.getName()+" -- "+conn.getName()+";");
			}
		}
		strBuilder.append("\n}\n");
		return strBuilder.toString();
	}
	
	
	private int[][] initializeAdjacencyMatrix() {
		int numNodes = f_nodes.size();
		int[][] adjacencyMatrix = new int[numNodes][numNodes];
		for (int i = 0; i < numNodes; i++) {
			for (int j = 0; j < numNodes; j++) {
				adjacencyMatrix[i][j] = 0;
			}
		}
		return adjacencyMatrix;
	}
	

	@Override
	protected int[][] createAdjacencyMatrix() {
		int[][] adjacencyMatrix = initializeAdjacencyMatrix();
		Map<String, ArrayList<String>> adjacencyList = getAdjacencyList();
		Set<String> keys = adjacencyList.keySet();
		
		ArrayList<String> vertices = getVerticesList();
		
		for (String key : keys) {
			ArrayList<String> keyAdjList = adjacencyList.get(key);
			int keyIndex = vertices.indexOf(key);
			for (String node : keyAdjList) {
				int nodeIndex = vertices.indexOf(node);
				adjacencyMatrix[keyIndex][nodeIndex] = 1;
			}
		}
		return adjacencyMatrix;	
	}

	
	@Override
	public int[][] getAjacencyMatrix() {
		return createAdjacencyMatrix();
	}
	
	
	protected ArrayList<String> createVerticesList() {
		ArrayList<String> verticesList = new ArrayList<String>();
		for (Node node : f_nodes) {
			verticesList.add(node.getLabel());
		}
		return verticesList;
	}

	
	public ArrayList<String> getVerticesList() {
		return createVerticesList();
	}


}
