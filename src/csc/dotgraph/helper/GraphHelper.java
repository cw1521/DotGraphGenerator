package csc.dotgraph.helper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
}
