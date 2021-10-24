package csc.dotgraph.graph;

public class Node {
	
	private String f_name;
	private String f_label;
	private String f_color;
	private String f_shape;
	private String f_style;
	private String f_visitedColor;
	
	public Node(String name, String label, String shape) {
		f_name = name;
		f_label = label;
		f_shape = shape;
		f_color = null;
		f_visitedColor = null;
	}
	
	public Node(String name, String label, String shape, String color) {
		f_name = name;
		f_label = label;
		f_shape = shape;
		f_color = color;
		f_visitedColor = null;
	}
	
	public Node(String name, String label, String shape, String color, String style) {
		f_name = name;
		f_label = label;
		f_shape = shape;
		f_color = color;
		f_style = style;
		f_visitedColor = null;
	}
	
	public String getName() {
		return f_name;
	}
	
	public String getLabel() {
		return f_label;
	}
	
	public String getShape() {
		return f_shape;
	}
	
	public String getColor() {
		return f_color;
	}

	
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(f_name+" [label=\""+f_label+"\",shape="+f_shape);	
		if (f_color != null) 
			strBuilder.append(",color="+f_color);
		if (f_style != null)
			strBuilder.append(",style="+f_style);
		strBuilder.append("];");
		return strBuilder.toString();
	}
	
	public void setVisitedColor(String color) {
		f_visitedColor = color;
	}
	
	public String getVisitedColor() {
		return f_visitedColor;
	}
}
