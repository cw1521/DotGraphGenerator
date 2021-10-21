package csc.dotgraph.generator;


import csc.dotgraph.graph.Graph;
import csc.dotgraph.graph.Node;
import csc.dotgraph.graph.UndirectedGraph;
import csc.dotgraph.helper.GraphHelper;

public class GraphGenerator {
	
	private static String currentDirectory = System.getProperty("user.dir");
	private static final String FILESEP = System.getProperty("file.separator");
	private static String outputDirectory = currentDirectory + FILESEP + "output" + FILESEP;

	public static void main(String[] args) {
		
		String oFilePath = outputDirectory + "graph1.dot";
		
		Node a = new Node("A", "A", "square", "red", "filled");
		Node b = new Node("B", "B", "square", "red", "filled");
		Node c = new Node("C", "C", "circle", "yellow", "filled");
		Node d = new Node("D", "D", "circle", "yellow", "filled");
		Node e = new Node("E", "E", "circle", "yellow", "filled");
		Node _1 = new Node("1", "1", "plaintext");
		Node _2 = new Node("2", "2", "plaintext");
		Node _3 = new Node("3", "3", "plaintext");
		Node _4 = new Node("4", "4", "plaintext");
		
		Graph graph1 = new UndirectedGraph("graph1");
		
		graph1.addNode(a);
		graph1.addNode(b);
		graph1.addNode(c);
		graph1.addNode(d);
		graph1.addNode(e);
		graph1.addNode(_1);
		graph1.addNode(_2);
		graph1.addNode(_3);
		graph1.addNode(_4);
		
		graph1.addConnection(a, c);
		graph1.addConnection(a, b);
		graph1.addConnection(c, _1);
		graph1.addConnection(a, d);
		graph1.addConnection(d, _2);
		graph1.addConnection(b, e);
		graph1.addConnection(e, _3);
		graph1.addConnection(e, _4);
		
		GraphHelper.createGVFromGraph(graph1, oFilePath);
	}

}
