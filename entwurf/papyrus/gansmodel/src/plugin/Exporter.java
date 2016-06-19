package plugin;

import java.io.FileOutputStream;

import graphmodel.SerializedGraph;

/**
 * The exporter interface is used to export a graph from it's internal representation into a specific file.
 * For every graph structure given as SerializedGraph/SerializedVertex/SerializedEdge interfaces the 
 * implementing class translates it into a FileOutputStream for the given file type, by {@code getSupportedFileEnding}.
 */
public interface Exporter {

	/**
	 * Get all filetypes which this exporter can parse
	 * 
	 * @return 
	 */
	public String getSupportedFileEnding();

	/**
	 * Get the name of this importer
	 * 
	 * @return 
	 */
	public String getName();

	/**
	 * This method writes an {@link SerializedGraph} into an FileOutputStream.
	 * 
	 * @param graph
	 * @param filestream 
	 */
	public void exportGraph(SerializedGraph graph, FileOutputStream filestream); 

}
