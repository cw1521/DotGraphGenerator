package csc.dotgraph.driver;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import csc.dotgraph.graph.Graph;
import csc.dotgraph.graph.Node;
import csc.dotgraph.graph.UndirectedGraph;
import csc.dotgraph.helper.GraphHelper;

public class GraphDriver {
	
	private static String currentDirectory = System.getProperty("user.dir");
	private static final String FILESEP = System.getProperty("file.separator");
	private static String outputDirectory = currentDirectory + FILESEP + "output" + FILESEP;

	public static void main(String[] args) {
		
		String oFilePath = outputDirectory + "graph1.dot";
		
		Node a = new Node("A", "A", "circle");
		Node b = new Node("B", "B", "circle");
		Node c = new Node("C", "C", "circle");
		Node d = new Node("D", "D", "circle");
		Node e = new Node("E", "E", "circle");
		Node f = new Node("F", "F", "circle");
		Node g = new Node("G", "G", "circle");
		Node h = new Node("H", "H", "circle");
		Node i = new Node("I", "I", "circle");
		Node j = new Node("J", "J", "circle");
		Node k = new Node("K", "K", "circle");
		Node l = new Node("L", "L", "circle");
		Node m = new Node("M", "M", "circle");
		Node n = new Node("N", "N", "circle");
		Node o = new Node("O", "O", "circle");
		Node p = new Node("P", "P", "circle");
		Node q = new Node("Q", "Q", "circle");
		Node r = new Node("R", "R", "circle");
		Node s = new Node("S", "S", "circle");
		Node t = new Node("T", "T", "circle");
		Node u = new Node("U", "U", "circle");
		Node v = new Node("V", "V", "circle");
		Node w = new Node("W", "W", "circle");
		Node x = new Node("X", "X", "circle");
		Node y = new Node("Y", "Y", "circle");

		
		Graph graph1 = new UndirectedGraph("graph1");
		graph1.addNode(a);
		graph1.addNode(b);
		graph1.addNode(c);
		graph1.addNode(d);
		graph1.addNode(e);
		graph1.addNode(f);
		graph1.addNode(g);
		graph1.addNode(h);
		graph1.addNode(i);
		graph1.addNode(j);
		graph1.addNode(k);
		graph1.addNode(l);
		graph1.addNode(m);
		graph1.addNode(n);
		graph1.addNode(o);
		graph1.addNode(p);
		graph1.addNode(q);
		graph1.addNode(r);
		graph1.addNode(s);
		graph1.addNode(t);
		graph1.addNode(u);
		graph1.addNode(v);
		graph1.addNode(w);
		graph1.addNode(x);
		graph1.addNode(y);
		
		
		
		graph1.addConnection(a,b);
		graph1.addConnection(a,c);
		graph1.addConnection(c,b);
		graph1.addConnection(d,b);
		graph1.addConnection(d,e);
		graph1.addConnection(f,g);
		graph1.addConnection(e,f);
		graph1.addConnection(h,g);
		graph1.addConnection(a,i);
		graph1.addConnection(d,j);		
		graph1.addConnection(k,i);
		graph1.addConnection(a,l);
		graph1.addConnection(n,m);
		graph1.addConnection(n,f);
		graph1.addConnection(d,o);		
		graph1.addConnection(p,n);
		graph1.addConnection(r,q);
		graph1.addConnection(k,r);
		graph1.addConnection(j,s);
		graph1.addConnection(t,s);		
		graph1.addConnection(u,v);
		graph1.addConnection(x,w);
		graph1.addConnection(y,u);
		graph1.addConnection(p,u);
		graph1.addConnection(x,e);
		
		
		
		printAdjacencyList(graph1);
		printAdjacencyMatrix(graph1);
		
		
//		GraphHelper.createGVFromGraph(graph1, oFilePath);
	}
	
	private static void printAdjacencyList(Graph graph) {
		System.out.println("Adjacency List");
		System.out.println(GraphHelper.adjacencyListToString(graph));		
	}
	
	private static void printAdjacencyMatrix(Graph graph) {
		System.out.println("Adjacency Matrix");
		System.out.println(GraphHelper.adjacencyMatrixToString(graph));
	}
	
	private static void breadthFirstSearch(Graph graph, String start) {
		LinkedList<String> queue = new LinkedList<String>();
		HashMap<String, ArrayList<String>> adjacencyList = graph.getAdjacencyList();
		ArrayList<String> verticesList = graph.getVerticesList();
	}

}
