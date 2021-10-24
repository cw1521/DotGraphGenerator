package csc.dotgraph.helper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import csc.dotgraph.BFSTable.BFSTable;
import csc.dotgraph.graph.Graph;

public class GraphHelper {

	public static void createGVFromGraph(Graph graph, String path) {
		File file = new File(path);
		try {
			FileWriter output = new FileWriter(file);
			output.write(graph.toString());
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String adjacencyListToString(Graph graph) {
		StringBuilder sb = new StringBuilder();
		Map<String, ArrayList<String>> adjacencyList = graph.getAdjacencyList();
		Set<String> nodes = adjacencyList.keySet();
		
		for (String node : nodes) {
			sb.append(node+": ");
			sb.append(adjacencyList.get(node).toString()+"\n");
		}
		return sb.toString();
	}
	
	public static String adjacencyMatrixToString(Graph graph) {
		StringBuilder sb = new StringBuilder();
		ArrayList<String> verticesList = graph.getVerticesList();
		int[][] adjacencyMatrix = graph.getAjacencyMatrix();
		sb.append(" ");
		for (String v : verticesList) {
			sb.append("  "+v);
		}
		sb.append("\n");
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			sb.append(verticesList.get(i));
			for (int j = 0; j < adjacencyMatrix[i].length; j++) {
				sb.append("  "+adjacencyMatrix[i][j]);
			}
			sb.append("\n");
		}
		return sb.toString();		
	}
	
	
	public static void createBFSTableFile(String path, BFSTable table) {
		File file = new File(path);
		try {
			FileWriter output = new FileWriter(file);
			output.write(table.toCSVString());
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
