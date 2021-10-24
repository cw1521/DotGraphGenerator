package csc.dotgraph.BFSTable;

public class BFSTableEntry {
	private String f_name;
	private String f_color;
	private String f_predecessor;
	private int f_distance;
	
	public BFSTableEntry(String name) {
		f_name = name;
		f_color = "White";
		f_distance = -1;
		f_predecessor = null;
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return f_name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		f_name = name;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return f_color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		f_color = color;
	}
	/**
	 * @return the predecessor
	 */
	public String getPredecessor() {
		return f_predecessor;
	}
	/**
	 * @param predecessor the predecessor to set
	 */
	public void setPredecessor(String predecessor) {
		f_predecessor = predecessor;
	}
	/**
	 * @return the distance
	 */
	public int getDistance() {
		return f_distance;
	}
	/**
	 * @param distance the distance to set
	 */
	public void setDistance(int distance) {
		f_distance = distance;
	}

}
