package csc.dotgraph.BFSTable;

import java.util.HashMap;
import java.util.Set;

public class BFSTable {
	private HashMap<String, BFSTableEntry> f_table;
	
	public BFSTable() {
		f_table = new HashMap<String, BFSTableEntry>();
	}
	
	public boolean addEntry(String name, BFSTableEntry entry) {
		if (!getTable().containsKey(name)) {
			getTable().put(name, entry);
			return true;
		}
		else return false;
	}

	/**
	 * @return the table
	 */
	public HashMap<String, BFSTableEntry> getTable() {
		return f_table;
	}
	

	public String toCSVString() {
		StringBuilder sb = new StringBuilder();
		Set<String> keys = f_table.keySet();
		sb.append(" ");
		for (String key : keys) {
			sb.append(","+key);
		}
		sb.append("\nColor");
		for (String key : keys) {
			sb.append(","+f_table.get(key).getColor());
		}
		sb.append("\nDistance");
		for (String key : keys) {
			if (f_table.get(key).getDistance() == -1) sb.append(",inf");
			else sb.append(","+Integer.toString(f_table.get(key).getDistance()));
		}
		sb.append("\nPredecessor");
		for (String key : keys) {
			sb.append(","+f_table.get(key).getPredecessor());
		}
		sb.append("\n");
		
		return sb.toString();
	}
	
}
